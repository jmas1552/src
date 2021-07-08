package freshers2021;

import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

class Fortune {

	private static final String BEST_HAPPY = "��g�ł��B���߂łƂ��������܂��I";
	private static final String SECOND_HAPPY = "�g�ł��B";
	private static final String MIDDLE_HAPPY = "���g�ł��B";
	private static final String NEXT_TO_WORST_HAPPY = "���g�ł�";
	private static final String WORST_HAPPY = "���ł��B�t�@�C�g�I�I";
	public static final String EXCLAMATION_MARK = "�I�I�I�I�I�I�I�I�I�I�I�I�I�I�I�I�I�I�I�I";
	public static final String EROOR_MESSAGE_ILLEGAL_INPUT = "�s���Ȓl�����͂���܂����B�������I�����܂��B";
	public static final String NO_NAME_EROOR_MESSAGE = "���O�̓��͂��Ȃ��������߁A�������I�����܂��B";
	public static final String BLANK_LINE = "";
	String name = null;
	Scanner stdIn = new Scanner(System.in);
	Random rand = new Random();

	public void startTodaysFortune() throws SubException, NotStartProgramException {

		System.out.println("����������������������");
		System.out.println("�����̉^���v���O����");
		System.out.println("����������������������");
		try {
			for (int i = 0; i < 3; i++) {
				System.out.print("���Ȃ��̖��O����͂��Ă�������");
				name = stdIn.nextLine();

				if (name.isEmpty()) {
					if (i == 2) {
						throw new RuntimeException();
					}
				} else {
					System.out.print(name + "����̍����̉^���́A");
					decideTodaysFortune();
					break;
				}
			}
		} catch (RuntimeException e) {
			System.out.println(EXCLAMATION_MARK);
			System.out.println(NO_NAME_EROOR_MESSAGE);
			System.out.println(EXCLAMATION_MARK);
			throw new NotStartProgramException(e);
		} catch (Exception e) {
			throw new SubException(e);
		}
	}

	public void decideTodaysFortune() {
		// �����ݒ�
		int rnd = rand.nextInt(10);

		if (0 <= rnd && rnd < 1) {
			// ��g
			bestHappy();
		} else if (1 <= rnd && rnd <= 2) {
			// �g
			secondHappy();
		} else if (3 <= rnd && rnd <= 6) {
			// ���g
			middleHappy();
		} else if (6 < rnd && rnd <= 8) {
			// ���g
			secondUnHappy();
		} else if (8 < rnd && rnd <= 10) {
			// ��
			worstHappy();
		}
	}

	public void bestHappy() {
		System.out.print(BEST_HAPPY);
	}

	public void secondHappy() {
		System.out.print(SECOND_HAPPY);
	}

	public void middleHappy() {
		System.out.print(MIDDLE_HAPPY);
	}

	public void secondUnHappy() {
		System.out.print(NEXT_TO_WORST_HAPPY);
	}

	public void worstHappy() {
		System.out.print(WORST_HAPPY);
	}

}
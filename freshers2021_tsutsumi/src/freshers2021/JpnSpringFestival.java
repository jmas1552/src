package freshers2021;

import java.util.Scanner;
import java.util.InputMismatchException;

class JpnSpringFestival {

	private static final String YES = "y";
	private static final String NO = "n";
	public static final String names[] = new String[6];
	public static final int beansNum[] = new int[6];
	Scanner stdIn = new Scanner(System.in);
	
	public void algorithm() {
		

		names[0] = "���������";
		names[1] = "�΂������";
		names[2] = "�Ƃ������";
		names[3] = "���������";
		names[4] = "����";
		names[5] = "��������";

		System.out.println("����������������������");
		System.out.println("�ߕ��A���S���Y���v���O����");
		System.out.println("����������������������");

		System.out.println("�����͐ߕ��ł���(y/n)");
		String answer = stdIn.next();

		// �ߕ��łȂ��ꍇ�̓T�[�r�X�I��
		if (NO.equals(answer)) {
			System.out.println("�{���͐ߕ��̓��ł͂Ȃ��̂ŁA�I�����܂��B");
			System.exit(0);
		} else if (YES.equals(answer)) {
			startAlgorithm();
		}
	}

	public void startAlgorithm() {

		try {
			for (int i = 0; i < beansNum.length; i++) {
				System.out.println(names[i] + "�̔N��");
				beansNum[i] = stdIn.nextInt();
				if (beansNum[i] > 100) {
					System.exit(1);
				}
			}
			for (int i = 0; i < beansNum.length; i++) {
				System.out.print("������" + names[i] + "�͓���");
				System.out.println(beansNum[i] + "���H�ׂ܂���������");
			}
			int sum = 0;
			String beans100Piaces = null;
			String beans200Piaces = null;
			for (int j = 0; j < beansNum.length; j++) {
				sum += beansNum[j];
				if (beans100Piaces == null && sum >= 100) {
					beans100Piaces = names[j];
					System.out.println("100���ڂ̓���H�ׂ��ЂƂ�" + names[j]);
				} else if (beans200Piaces == null && sum >= 200) {
					beans200Piaces = names[j];
					System.out.println("200���ڂ̓���H�ׂ��ЂƂ�" + names[j]);
				}
			}
			System.out.print("�Ƒ��S���ŐH�ׂ����̐��́A");
			System.out.println(sum + "�ł�");
		} catch (InputMismatchException e) {
			System.out.println(MainProgram.EXCLAMATION_MARK);
			System.out.println(MainProgram.EROOR_MESSAGE_ILLEGAL_INPUT);
			System.out.println(MainProgram.EXCLAMATION_MARK);
			System.exit(1);
		}
	}
}
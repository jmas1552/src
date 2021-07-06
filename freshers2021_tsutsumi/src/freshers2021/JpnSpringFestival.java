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

		// �v���O�����\��o��
		System.out.println("����������������������");
		System.out.println("�ߕ��A���S���Y���v���O����");
		System.out.println("����������������������");

		// �ߕ��̓���
		System.out.println("�����͐ߕ��ł���(y/n)");
		try {
			String answer = stdIn.next();

			// �ߕ��łȂ��ꍇ�̓T�[�r�X�I��
			if (NO.equals(answer)) {
				System.out.println("�{���͐ߕ��̓��ł͂Ȃ��̂ŁA�I�����܂��B");

				// �ߕ��̓��̑Ή�
			} else if (YES.equals(answer)) {
				startAlgorithm();

				// �I�����ȊO�̓��͂��������ۂ̓G���[���b�Z�[�W�\��
			} else {
				MainProgram.messageInputMismatch();
			}
			// ���ʎq�ɑΉ����Ȃ����͂����������ۂ͗�O��������
		} catch (InputMismatchException e) {
			MainProgram.messageInputMismatch();
		}
	}

	// �ߕ��̓��A���S���Y���J�n
	public void startAlgorithm() {

		try {
			// �e�l�̔N����͂�v��
			for (int i = 0; i < beansNum.length; i++) {
				System.out.println(names[i] + "�̔N��");
				beansNum[i] = stdIn.nextInt();
				if (beansNum[i] > 100) {
					MainProgram.messageInputMismatch();
					System.exit(1);
				}
			}
			// �e�l�̐H�ׂ�����\��
			for (int i = 0; i < beansNum.length; i++) {
				System.out.print("������" + names[i] + "�͓���");
				System.out.println(beansNum[i] + "���H�ׂ܂���������");
			}
			int sum = 0;
			String beans100Piaces = null;
			String beans200Piaces = null;
			for (int j = 0; j < beansNum.length; j++) {
				sum += beansNum[j];

				// 100�ڂ̓���H�ׂ��l�\��
				if (beans100Piaces == null && sum >= 100) {
					beans100Piaces = names[j];
					System.out.println("100���ڂ̓���H�ׂ��ЂƂ�" + names[j]);

					// 200�ڂ̓���H�ׂ��l�\��
				} else if (beans200Piaces == null && sum >= 200) {
					beans200Piaces = names[j];
					System.out.println("200���ڂ̓���H�ׂ��ЂƂ�" + names[j]);
				}
			}
			if (sum < 100) {
				System.out.println("100���ڂ̓���H�ׂ��ЂƂ͂��܂���B");
			}
			if (sum < 200) {
				System.out.println("200���ڂ̓���H�ׂ��ЂƂ͂��܂���B");
			}
			// �Ƒ��S�����H�ׂ����̍��v��\��
			System.out.print("�Ƒ��S���ŐH�ׂ����̐��́A");
			System.out.println(sum + "�ł�");

			// ���ʎq�ɑΉ����Ȃ����͂����������ۂ͗�O��������
		} catch (InputMismatchException e) {
			MainProgram.messageInputMismatch() ;
			//�S�ʓI�ȃG���[�̓��C���v���O�����ŏ������ďI��
		}catch (Exception e) {
			throw new SubException(e);
		}
	}
}
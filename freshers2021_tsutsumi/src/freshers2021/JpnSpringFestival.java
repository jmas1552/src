package freshers2021;

import java.util.Scanner;
import java.util.InputMismatchException;

class JpnSpringFestival {

	private static final String YES = "y";
	private static final String NO = "n";
	private static final String NAMES[] = new String[6];
	private static final int BEANS_NUM[] = new int[6];
	Scanner stdIn = new Scanner(System.in);

	//�ߕ��A���S���Y���J�n�m�F���\�b�h
	public void algorithm() throws SubException{

		NAMES[0] = "���������";
		NAMES[1] = "�΂������";
		NAMES[2] = "�Ƃ������";
		NAMES[3] = "���������";
		NAMES[4] = "����";
		NAMES[5] = "��������";

		// �v���O�����\��o��
		System.out.println("����������������������");
		System.out.println("�ߕ��A���S���Y���v���O����");
		System.out.println("����������������������");

		// �ߕ��̓����m�F
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

	// �ߕ��̓��A���S���Y���J�n�@
	public void startAlgorithm() throws SubException{

		try {
			// �e�l�̔N����͂�v��
			for (int i = 0; i < BEANS_NUM.length; i++) {
				System.out.println(NAMES[i] + "�̔N��");
				BEANS_NUM[i] = stdIn.nextInt();
			//�e�l�N��100�΂܂łƂ���i�����������̂̓G���[���b�Z�[�W�\���j
				if (BEANS_NUM[i] > 100) {
					MainProgram.messageInputMismatch();
					System.exit(1);
				}
			}
			// �e�l�̐H�ׂ�����\��
			for (int i = 0; i < BEANS_NUM.length; i++) {
				System.out.print("������" + NAMES[i] + "�͓���");
				System.out.println(BEANS_NUM[i] + "���H�ׂ܂���������");
			}
			//�e�l�̐H�ׂ����������ɉ����ĉ��Z���Ă���
			int sum = 0;
			String beans100Piaces = null;
			String beans200Piaces = null;
			for (int j = 0; j < BEANS_NUM.length; j++) {
				sum += BEANS_NUM[j];

				// 100�ڂ̓���H�ׂ��l�\��
				if (beans100Piaces == null && sum >= 100) {
					beans100Piaces = NAMES[j];
					// System.out.println("100���ڂ̓���H�ׂ��ЂƂ�" + NAMES[j]);

					// 200�ڂ̓���H�ׂ��l�\��
				} else if (beans200Piaces == null && sum >= 200) {
					beans200Piaces = NAMES[j];
					// System.out.println("200���ڂ̓���H�ׂ��ЂƂ�" + NAMES[j]);
				}
			}
			
			if (beans100Piaces == null) {
				System.out.println("100���ڂ̓���H�ׂ��ЂƂ͂��܂���B");
			} else {
				System.out.println("100���ڂ̓���H�ׂ��ЂƂ�" + beans100Piaces);				
			}
			
			if (beans200Piaces == null) {
				System.out.println("200���ڂ̓���H�ׂ��ЂƂ͂��܂���B");
			} else {
				System.out.println("200���ڂ̓���H�ׂ��ЂƂ�" + beans200Piaces);
			}
			
			//			if (sum < 100) {
//				System.out.println("100���ڂ̓���H�ׂ��ЂƂ͂��܂���B");
//			}
//			if (sum < 200) {
//				System.out.println("200���ڂ̓���H�ׂ��ЂƂ͂��܂���B");
//			}
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
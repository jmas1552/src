package freshers2021;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Car {

	Scanner stdIn = new Scanner(System.in);
	private int howChargeAnswer;
	private int sumFee;
	private double fuelFee;
	private static final double FUEL_ECONMY = 1.5;
	private static final String YES = "y";
	private static final String NO = "n";
	public static final String EROOR_MESSAGE_ILLEGAL_INPUT = "�I�����܂��B";

	public void charge() throws SubException, NotStartProgramException {
		try {
			System.out.println("��������������������������");
			System.out.println("�d�C���]�ԏ[�d�v���O����");
			System.out.println("��������������������������");

			System.out.println("�d�C���]�ԁuJ-chary�v�́A1kw������1.5km���邱�Ƃ��ł��܂��B");

			System.out.println("�[�d���܂���(y/n)");
			String chargeAnswer = stdIn.next();

			if (NO.equals(chargeAnswer)) {
				System.out.println("�I�����܂��B");
				throw new RuntimeException();
			} else if (!(YES.equals(chargeAnswer) || NO.equals(chargeAnswer))) {
				throw new InputMismatchException();
			}

			System.out.println("���L�����b�g�[�d���܂����H");
			howChargeAnswer = stdIn.nextInt();
			if(howChargeAnswer>200) {
				throw new InputMismatchException();
			}
			System.out.println(howChargeAnswer + "�L�����b�g�A�[�d���܂����B");

			System.out.print("���Ȃ���J-chary�́A");
			System.out.println(howChargeAnswer * FUEL_ECONMY + "km���邱�Ƃ��o���܂��B");
			sumFee = howChargeAnswer * (int) fuelFee;

			System.out.println("�[�d�ɂ���������p��" + sumFee + "�~�ł��B");
		} catch (InputMismatchException e) {
			System.out.println(MainProgram.EXCLAMATION_MARK);
			System.out.println(MainProgram.EROOR_MESSAGE_ILLEGAL_INPUT);
			System.out.println(MainProgram.EXCLAMATION_MARK);
			throw new SubException(e);
		} catch (RuntimeException e) {
			throw new NotStartProgramException(e);
		}
	}

	// �[�d�ʂɉ������d�C������߂�
	public void calculateCharge() {
		if (howChargeAnswer <= 30) {
			fuelFee = 17.73;
		} else if (howChargeAnswer >= 31 && howChargeAnswer <= 80) {
			fuelFee = 21.26;
		} else if (howChargeAnswer >= 81 && howChargeAnswer <= 100) {
			fuelFee = 24.07;
		} else if (howChargeAnswer >= 101 && howChargeAnswer <= 200) {
			fuelFee = 25.31;
		}
	}
}

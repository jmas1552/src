package freshers2021;

import java.util.Scanner;

public class Car {
	
	Scanner stdIn=new Scanner(System.in);
	int howChargeAnswer;
	int sumFee;
	double fuelFee;
	double fuelEconomy=1.5;
	private static final String YES= "y";
	private static final String NO="n";
	
	
	public void charge(){
		System.out.println("��������������������������");
		System.out.println("�d�C���]�ԏ[�d�v���O����");
		System.out.println("��������������������������");
		
		System.out.println("�d�C���]�ԁuJ-chary�v�́A1kw������1.5km���邱�Ƃ��ł��܂��B");
		
		System.out.println("�[�d���܂���(y/n)");
		String chargeAnswer=stdIn.next();
		
		if (NO.equals(chargeAnswer)) {
			System.out.println("�I�����܂��B");
		
		} else if (YES.equals(chargeAnswer)) {
			startCharge();
		}
	}
		
	public void startCharge(){
		System.out.println("���L�����b�g�[�d���܂����H");
		howChargeAnswer=stdIn.nextInt();
		
		calculateCharge();
		
		System.out.println(howChargeAnswer + "�L�����b�g�A�[�d���܂����B");
		
		System.out.print("���Ȃ���J-chary�́A");
		System.out.println(howChargeAnswer*fuelEconomy + "km���邱�Ƃ��o���܂��B");
		
		sumFee=howChargeAnswer*(int)fuelFee;
		
		System.out.println("�[�d�ɂ���������p��" + sumFee + "�~�ł��B");
	}
	public void calculateCharge(){
		if(howChargeAnswer<=30) {
			fuelFee=17.73;
		}else if(howChargeAnswer>=31 && howChargeAnswer<=80) {
			fuelFee=21.26;
		}else if(howChargeAnswer>=81 && howChargeAnswer<=100) {
			fuelFee=24.07;
		}else if(howChargeAnswer>=101 && howChargeAnswer<=200) {
			fuelFee=25.31;
		}else {
			
		}
	}
}

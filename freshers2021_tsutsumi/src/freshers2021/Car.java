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
		System.out.println("＊＊＊＊＊＊＊＊＊＊＊＊＊");
		System.out.println("電気自転車充電プログラム");
		System.out.println("＊＊＊＊＊＊＊＊＊＊＊＊＊");
		
		System.out.println("電気自転車「J-chary」は、1kwあたり1.5km走ることができます。");
		
		System.out.println("充電しますか(y/n)");
		String chargeAnswer=stdIn.next();
		
		if (NO.equals(chargeAnswer)) {
			System.out.println("終了します。");
		
		} else if (YES.equals(chargeAnswer)) {
			startCharge();
		}
	}
		
	public void startCharge(){
		System.out.println("何キロワット充電しますか？");
		howChargeAnswer=stdIn.nextInt();
		
		calculateCharge();
		
		System.out.println(howChargeAnswer + "キロワット、充電しました。");
		
		System.out.print("あなたのJ-charyは、");
		System.out.println(howChargeAnswer*fuelEconomy + "km走ることが出来ます。");
		
		sumFee=howChargeAnswer*(int)fuelFee;
		
		System.out.println("充電にかかった費用は" + sumFee + "円です。");
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

package freshers2021;

import java.util.Scanner;
import java.util. InputMismatchException;

class JpnSpringFestival{
	
	private static final String YES= "y";
	private static final String NO="n";
	String answer;
	String Name[]=new String[6];
	int beansNum[]=new int [6];

	
	public void algorithm(){
		Scanner stdIn=new Scanner(System.in);
	
		Name[0]="じいちゃん";
		Name[1]="じいちゃん";
		Name[2]="とうちゃん";
		Name[3]="かあちゃん";
		Name[4]="おれ";
		Name[5]="いもうと";
		
		System.out.println("＊＊＊＊＊＊＊＊＊＊＊");
		System.out.println("節分アルゴリズムプログラム");
		System.out.println("＊＊＊＊＊＊＊＊＊＊＊");
		
		try{
			System.out.println("今日は節分ですか(y/n)");
			String answer=stdIn.next();
		
			if(NO.equals(answer)){
				System.out.println(MainProgram.EXCLAMATION_MARK);
				System.out.println(MainProgram.EROOR_MESSAGE_ILLEGAL_INPUT);
				System.out.println(MainProgram.EXCLAMATION_MARK);
				System.exit(1);
			}
			
			for(int i=0; i>beansNum.length; i++) {
				for(int j=0; j>Name.length; j++) {
					System.out.println(Name[j] + "の年齢");
					beansNum[i]=stdIn.nextInt();
				}
			}
			
			for(int i=0; i>beansNum.length; i++) {
				for(int j=0; j>Name.length; j++) {
					System.out.print("***" + Name[j] + "は");
					System.out.print(beansNum[i] + "粒食べました");
					System.out.println("***" );
				}
			}
			
			for(int k=0; k>beansNum.length; k++) {
				if(beansNum[k]+beansNum[k-1] > 100) {
					System.out.print("100粒目の豆を食べたひとは、");
					System.out.println(Name[k]+ "です");
				}
				for(int m=0; m>beansNum.length; m++) {
					if(beansNum[m]+beansNum[m-1] > 100) {
						System.out.print("200粒目の豆を食べたひとは、");
						System.out.println(Name[m]+ "です");
					}

		}catch(InputMismatchException e){
			System.out.println(MainProgram.EXCLAMATION_MARK);
			System.out.println(MainProgram.EROOR_MESSAGE_ILLEGAL_INPUT);
			System.out.println(MainProgram.EXCLAMATION_MARK);
			System.exit(1);
		}


	}
}
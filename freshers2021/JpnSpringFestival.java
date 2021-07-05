package freshers2021;

import java.util.Scanner;
import java.util. InputMismatchException;

class JpnSpringFestival{
	
	private static final String YES= "y";
	private static final String NO="n";
	private static final int Name[6];
	public void algorithm(){
		Scanner stdIn=new Scanner(System.in);
	

		
		System.out.println("＊＊＊＊＊＊＊＊＊＊＊");
		System.out.println("節分アルゴリズムプログラム");
		System.out.println("＊＊＊＊＊＊＊＊＊＊＊");
		
		try{
			System.out.println("今日は節分ですか(y/n)");
			String d=stdIn.next();
		
			if(d.equals(NO)){
				System.out.println(MainProgram.EXCLAMATION_MARK);
				System.out.println(MainProgram.EROOR_MESSAGE_ILLEGAL_INPUT);
				System.out.println(MainProgram.EXCLAMATION_MARK);
				System.exit(1);
			}
			
			System.out.println("じいちゃんの年齢");
			int Name[0]=stdIn.next();
			System.out.println("ばあちゃんの年齢");
			int Name[1]=stdIn.next();
			System.out.println("とうちゃんの年齢");
			int Name[2]=stdIn.next();
			System.out.println("かあちゃんの年齢");
			int Name[3]=stdIn.next();
			System.out.println("おれの年齢");
			int Name[4]=stdIn.next();
			System.out.println("いもうとの年齢");
			int Name[5]=stdIn.next();
			
		}catch(InputMismatchException e){
			System.out.println(MainProgram.EXCLAMATION_MARK);
			System.out.println(MainProgram.EROOR_MESSAGE_ILLEGAL_INPUT);
			System.out.println(MainProgram.EXCLAMATION_MARK);
			System.exit(1);
		}


	}
}
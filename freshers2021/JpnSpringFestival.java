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
	

		
		System.out.println("����������������������");
		System.out.println("�ߕ��A���S���Y���v���O����");
		System.out.println("����������������������");
		
		try{
			System.out.println("�����͐ߕ��ł���(y/n)");
			String answer=stdIn.next();
		
			if(d.equals(NO)){
				System.out.println(MainProgram.EXCLAMATION_MARK);
				System.out.println(MainProgram.EROOR_MESSAGE_ILLEGAL_INPUT);
				System.out.println(MainProgram.EXCLAMATION_MARK);
				System.exit(1);
			}
			
			System.out.println("���������̔N��");
			beansNum[0]=stdIn.nextInt();
			System.out.println("�΂������̔N��");
			beansNum[1]=stdIn.nextInt();
			System.out.println("�Ƃ������̔N��");
			beansNum[2]=stdIn.nextInt();
			System.out.println("���������̔N��");
			beansNum[3]=stdIn.nextInt();
			System.out.println("����̔N��");
			beansNum[4]=stdIn.nextInt();
			System.out.println("�������Ƃ̔N��");
			beansNum[5]=stdIn.nextInt();
			
			
			System.out.print("");
			System.out.println();
		}catch(InputMismatchException e){
			System.out.println(MainProgram.EXCLAMATION_MARK);
			System.out.println(MainProgram.EROOR_MESSAGE_ILLEGAL_INPUT);
			System.out.println(MainProgram.EXCLAMATION_MARK);
			System.exit(1);
		}


	}
}
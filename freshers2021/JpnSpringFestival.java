package freshers2021;

import java.util.Scanner;
import java.util. InputMismatchException;

class JpnSpringFestival{
	
	private static final String YES= "y";
	private static final String NO="n";
	private static final int Name[6];
	public void algorithm(){
		Scanner stdIn=new Scanner(System.in);
	

		
		System.out.println("����������������������");
		System.out.println("�ߕ��A���S���Y���v���O����");
		System.out.println("����������������������");
		
		try{
			System.out.println("�����͐ߕ��ł���(y/n)");
			String d=stdIn.next();
		
			if(d.equals(NO)){
				System.out.println(MainProgram.EXCLAMATION_MARK);
				System.out.println(MainProgram.EROOR_MESSAGE_ILLEGAL_INPUT);
				System.out.println(MainProgram.EXCLAMATION_MARK);
				System.exit(1);
			}
			
			System.out.println("���������̔N��");
			int Name[0]=stdIn.next();
			System.out.println("�΂������̔N��");
			int Name[1]=stdIn.next();
			System.out.println("�Ƃ������̔N��");
			int Name[2]=stdIn.next();
			System.out.println("���������̔N��");
			int Name[3]=stdIn.next();
			System.out.println("����̔N��");
			int Name[4]=stdIn.next();
			System.out.println("�������Ƃ̔N��");
			int Name[5]=stdIn.next();
			
		}catch(InputMismatchException e){
			System.out.println(MainProgram.EXCLAMATION_MARK);
			System.out.println(MainProgram.EROOR_MESSAGE_ILLEGAL_INPUT);
			System.out.println(MainProgram.EXCLAMATION_MARK);
			System.exit(1);
		}


	}
}
package freshers2021;

import java.util.Scanner;
import java.util. InputMismatchException;

class JpnSpringFestival{
	
	private static final String YES= "y";
	private static final String NO="n";


	
	public void main(String[] args){
		Scanner stdIn=new Scanner(System.in);

		String Name[]=new String[6];
		int beansNum[]=new int[6];
		
		Name[0]="���������";
		Name[1]="���������";
		Name[2]="�Ƃ������";
		Name[3]="���������";
		Name[4]="����";
		Name[5]="��������";
		
		System.out.println("����������������������");
		System.out.println("�ߕ��A���S���Y���v���O����");
		System.out.println("����������������������");
		
		try{
			System.out.println("�����͐ߕ��ł���(y/n)");
			String answer=stdIn.next();
		
			if(NO.equals(answer)){
				System.out.println(MainProgram.EXCLAMATION_MARK);
				System.out.println(MainProgram.EROOR_MESSAGE_ILLEGAL_INPUT);
				System.out.println(MainProgram.EXCLAMATION_MARK);
				System.exit(1);
			}
			
			for(int i=0; i>beansNum.length; i++) {
				for(int j=0; j>Name.length; j++) {
					System.out.println(Name[j] + "�̔N��");
					beansNum[i]=stdIn.nextInt();
				}
			}
		
			
		}catch(InputMismatchException e){
			System.out.println(MainProgram.EXCLAMATION_MARK);
			System.out.println(MainProgram.EROOR_MESSAGE_ILLEGAL_INPUT);
			System.out.println(MainProgram.EXCLAMATION_MARK);
			System.exit(1);
		}
	}
}
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
			
			for(int i=0; i>beansNum.length; i++) {
				for(int j=0; j>Name.length; j++) {
					System.out.print("***" + Name[j] + "��");
					System.out.print(beansNum[i] + "���H�ׂ܂���");
					System.out.println("***" );
				}
			}
			
			for(int k=0; k>beansNum.length; k++) {
				if(beansNum[k]+beansNum[k-1] > 100) {
					System.out.print("100���ڂ̓���H�ׂ��ЂƂ́A");
					System.out.println(Name[k]+ "�ł�");
				}
				for(int m=0; m>beansNum.length; m++) {
					if(beansNum[m]+beansNum[m-1] > 100) {
						System.out.print("200���ڂ̓���H�ׂ��ЂƂ́A");
						System.out.println(Name[m]+ "�ł�");
					}

		}catch(InputMismatchException e){
			System.out.println(MainProgram.EXCLAMATION_MARK);
			System.out.println(MainProgram.EROOR_MESSAGE_ILLEGAL_INPUT);
			System.out.println(MainProgram.EXCLAMATION_MARK);
			System.exit(1);
		}


	}
}
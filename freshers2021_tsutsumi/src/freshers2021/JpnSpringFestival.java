package freshers2021;

import java.util.Scanner;
import java.util.InputMismatchException;

class JpnSpringFestival{
	
	private static final String YES= "y";
	private static final String NO="n";
	public static final String Name[]=new String[6];
	public static final int beansNum[]=new int[6];

	
	public void algorithm(){
		Scanner stdIn=new Scanner(System.in);


		
		Name[0]="���������";
		Name[1]="�΂������";
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
				System.out.println("�I�����܂��B");
				System.exit(0);
			}
			
			for(int i=0; i < beansNum.length; i++) {
					System.out.println(Name[i] + "�̔N��");
					beansNum[i]=stdIn.nextInt();
					if(beansNum[i]>100){
						System.exit(1);
					}
			}
			for(int i=0; i < beansNum.length; i++) {
					System.out.print("������" + Name[i] + "�͓���");
					System.out.println(beansNum[i]+ "���H�ׂ܂���������");
			}
			int sum=0;
			for(int j=0; j<beansNum.length; j++){  
				sum +=beansNum[j];
				if(sum >=100){
					System.out.print("100���ڂ̓���H�ׂ��ЂƂ́A");
					System.out.println(Name[j]+ "�ł�");
				}else{
					System.out.print("100���ڂ̓���H�ׂ��ЂƂ͂��܂���B");
				}
			}
			int countTwohundred=0;
			for(int m=0; m<beansNum.length; m++){  
				countTwohundred +=beansNum[m];
				if(countTwohundred >=200){
					System.out.print("200���ڂ̓���H�ׂ��ЂƂ́A");
					System.out.println(Name[m]+ "�ł�");
				}else{
					System.out.print("100���ڂ̓���H�ׂ��ЂƂ͂��܂���B");				
				}	
			}	
			
			int sum=0;
			for(int n=0; n<beansNum.length; n++){
				sum +=beansNum[n];
			}
			System.out.print("�Ƒ��S���ŐH�ׂ����̐��́A");
			System.out.println(sum + "�ł�");	
			
		}catch(InputMismatchException e){
			System.out.println(MainProgram.EXCLAMATION_MARK);
			System.out.println(MainProgram.EROOR_MESSAGE_ILLEGAL_INPUT);
			System.out.println(MainProgram.EXCLAMATION_MARK);
			System.exit(1);
		}
	}
}
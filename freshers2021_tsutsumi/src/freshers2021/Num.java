package freshers2021;

import java.util.Scanner;
import java.util.Arrays;
import java.util. InputMismatchException;

class Num{
	
	private static final String YES= "y";
	private static final String NO="n";
	Scanner stdIn=new Scanner(System.in);
	
	public void count(){
		
	

		
		System.out.println("����������������������");
		System.out.println("�������ёւ��v���O����");
		System.out.println("����������������������");
		
		try{
			System.out.println("�����ɕ��ёւ��܂���(y/n)");
			String d=stdIn.next();
		

		
			//�����̕��ёւ��������A�~���ȊO�ɑI�񂾍ۂɃG���[���o�͂���
		
			if(!(d.equals(YES) || d.equals(NO))){
				System.out.println(MainProgram.EXCLAMATION_MARK);
				System.out.println(MainProgram.EROOR_MESSAGE_ILLEGAL_INPUT);
				System.out.println(MainProgram.EXCLAMATION_MARK);
				System.exit(1);
			}
			//���בւ������������̌������߂�
			System.out.print("���בւ������������̐��͂����ł����H(2-5)");   			
			int x = stdIn.nextInt();	
			int num[] = new int[x];
			
			if(!(x >= 2  &&  x <= 5)){
				System.out.println(MainProgram.EXCLAMATION_MARK);
				System.out.println(MainProgram.EROOR_MESSAGE_ILLEGAL_INPUT);
				System.out.println(MainProgram.EXCLAMATION_MARK);
				System.exit(1);
			}
			//���בւ����鐔�������߂�
			for(int i=0; i < x ;i++){
				System.out.print((i+1) + "��:");
				num[i]=stdIn.nextInt();
				
				if(num[i] < 0 || num[i] > 100){
					System.out.println(MainProgram.EXCLAMATION_MARK);
					System.out.println(MainProgram.EROOR_MESSAGE_ILLEGAL_INPUT);
					System.out.println(MainProgram.EXCLAMATION_MARK);
					System.exit(1);
				}
			}
			Arrays.sort(num); 
			//����
			if(d.equals(YES)){

				System.out.println("�����ɕ��ёւ��܂��I"); 
    			System.out.println(Arrays.toString(num));
			}else if(d.equals(NO)){
				//�~��  
				System.out.print("�~���ɕ��ёւ��܂��I[");
				int [] reverse=new int[x];
				int rNum =x ;
				rNum -= 1;
				
		 		for(int i = rNum ; i>=0 ; i--){
		 			reverse[rNum-i]=num[i];
		 			System.out.print(reverse[rNum-i] + ",");
		 		}
				System.out.print("]");
			}

		}catch(InputMismatchException e){
			System.out.println(MainProgram.EXCLAMATION_MARK);
			System.out.println(MainProgram.EROOR_MESSAGE_ILLEGAL_INPUT);
			System.out.println(MainProgram.EXCLAMATION_MARK);
		}
		
	}
}
package freshers2021;


import java.util.Scanner;
import java.util.Random;

import java.util. InputMismatchException;

class Fortune{
	

	public static final String BEST_HAPPY="��g�ł��B���߂łƂ��������܂��I";
	public static final String SECOND_HAPPY="�g�ł��B";
	public static final String MIDDLE_HAPPY="���g�ł��B";
	public static final String NEXT_TO_WORST_HAPPY="���g�ł�";
	public static final String WORST_HAPPY="���ł��B�t�@�C�g�I�I";
	String name;



	public static void  main(String[]args){
	
	Scanner stdIn=new Scanner(System.in);
	Random rand=new Random();
		
			//�����ݒ�
 		int rnd = rand.nextInt(10);
		
		System.out.println("����������������������");
		System.out.println("�����̉^���v���O����");
		System.out.println("����������������������");
		
		System.out.println("���Ȃ��̖��O����͂��Ă�������");
		String name=stdIn.next();
		
		if(name==null){
			//�܂������ݒ芮�����Ă��Ȃ�
			for(int i=0; i<3; i++){
				System.out.println("���Ȃ��̖��O����͂��Ă�������");
					name=stdIn.next();
				if(name != null){
					continue;
				}//�����I��
			}
		}
		System.out.print(name + "����̍����̉^���́A");
		 	
			if(0 <= rnd && rnd < 1) {
 			 // ��g
		 	bestHappy();
  			}else if(1 <= rnd && rnd <= 2) {
    		// �g
  				secondHappy();
  			}else if(3 <= rnd && rnd <= 6){
    		// ���g
   				middleHappy();
  			}else if(6 < rnd && rnd <= 8){
    		// ���g
   				secondUnHappy();
  			}else if(8 < rnd && rnd <= 10){
    		// ��
   				worstHappy();
  			}
	}
	
	public static void bestHappy() {
		System.out.print(BEST_HAPPY);
	}
	public static void secondHappy() {
		System.out.print(SECOND_HAPPY);
	}
	public static void middleHappy() {
		System.out.print(MIDDLE_HAPPY);
	}
	public static void secondUnHappy() {
		System.out.print(NEXT_TO_WORST_HAPPY);
	}
	public static void worstHappy() {
		System.out.print(WORST_HAPPY);
	}
}
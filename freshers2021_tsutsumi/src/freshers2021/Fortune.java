package freshers2021;

import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

class Fortune {

	public static final String BEST_HAPPY = "��g�ł��B���߂łƂ��������܂��I";
	public static final String SECOND_HAPPY = "�g�ł��B";
	public static final String MIDDLE_HAPPY = "���g�ł��B";
	public static final String NEXT_TO_WORST_HAPPY = "���g�ł�";
	public static final String WORST_HAPPY = "���ł��B�t�@�C�g�I�I";
	String name;
	String nameAgain;
	
	public void  today(){
	
		Scanner stdIn=new Scanner(System.in);
		Random rand=new Random();
		
			//�����ݒ�
 		int rnd = rand.nextInt(10);
		
		System.out.println("����������������������");
		System.out.println("�����̉^���v���O����");
		System.out.println("����������������������");
		try {	
		System.out.println("���Ȃ��̖��O����͂��Ă�������");
		String name=stdIn.next();
		
		if("".equals(name)){
			for(int i=0; i<3; i++){
				System.out.print("���Ȃ��̖��O����͂��Ă�������");
				nameAgain=stdIn.next();
				if(!("".equals(nameAgain))){
					nameAgain();
					continue;
				}//�����I��
			}
		}
		
		} catch (InputMismatchException e) {
			MainProgram.messageInputMismatch();
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

	public void bestHappy() {
		System.out.print(BEST_HAPPY);
	}

	public void secondHappy() {
		System.out.print(SECOND_HAPPY);
	}

	public void middleHappy() {
		System.out.print(MIDDLE_HAPPY);
	}

	public void secondUnHappy() {
		System.out.print(NEXT_TO_WORST_HAPPY);
	}

	public void worstHappy() {
		System.out.print(WORST_HAPPY);
	}
	public void nameAgain() {
		name=nameAgain;
	}
}
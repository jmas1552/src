package freshers2021;

import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

class Fortune {

	private static final String BEST_HAPPY = "��g�ł��B���߂łƂ��������܂��I";
	private static final String SECOND_HAPPY = "�g�ł��B";
	private static final String MIDDLE_HAPPY = "���g�ł��B";
	private static final String NEXT_TO_WORST_HAPPY = "���g�ł�";
	private static final String WORST_HAPPY = "���ł��B�t�@�C�g�I�I";
	String name=null;
	Scanner stdIn=new Scanner(System.in);
	Random rand=new Random();
	
	public void  today(){

		System.out.println("����������������������");
		System.out.println("�����̉^���v���O����");
		System.out.println("����������������������");
		try {	
			for(int i=0; i<3; i++){
				System.out.print("���Ȃ��̖��O����͂��Ă�������");
				name=stdIn.nextLine();

				if(name.isEmpty()){
					if(i==2) {
						System.out.println("�I�I�I�I�I�I�I�I�I�I�I�I�I�I�I�I�I�I�I");
						System.out.println("���O�̓��͂��Ȃ��������߁A�������I�����܂��B");
						System.out.println("�I�I�I�I�I�I�I�I�I�I�I�I�I�I�I�I�I�I�I");
						return;
					}
				}
			}todaysFortune();
		}catch (InputMismatchException e) {
			MainProgram.messageInputMismatch();
		}catch (Exception e)  {
			MainProgram.messageException();
		}
	}	
	
	public void  todaysFortune(){
		
		
		System.out.print(name + "����̍����̉^���́A" );
	
		//�����ݒ�
		int rnd = rand.nextInt(10);
		
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

}
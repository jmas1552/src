package freshers2021;

import java.util.Scanner;
import java.util.Random;

import java.util. InputMismatchException;

public void today(){

	private final Random rand = new Random();
	public static final String BEST_HAPPY="��g�ł��B���߂łƂ��������܂��I";
	public static final String SECOND_HAPPY="�g�ł��B";
	public static final String MIDDLE_HAPPY="���g�ł��B";
	public static final String NEXT_TO_WORST_HAPPY="���g�ł�";
	public static final String WORST_HAPPY="���ł��B�t�@�C�g�I�I";
	String name;
	Scanner stdIn=new Scanner(System.in);
	Random rand=new Random();

	
	public static void algorithm(){
		
			//�����ݒ�
 		int rnd = rand(10);
 			 if(0 <= rnd && rnd < 1) {
			 	return BEST_HAPPY;
  			}else if(1 < rnd && rnd <= 2) {
    		// ��g
  				return SECOND_HAPPY;
  			}else if(2 < rnd && rnd <= 4){
    		// �g
   				return MIDDLE_HAPPY;	
  			}else if(4 < rnd && rnd <= 6){
    		// ���g
   				return NEXT_TO_WORST_HAPPY;
  			}else if(6 < rnd && rnd <= 8){
			// ���g
   				return eItem_CopperCoin;
  			}else if(8 < rnd && rnd <= 10){
    		// ��
   				return WORST_HAPPY;
		}
		
		System.out.println("����������������������");
		System.out.println("�����̉^���v���O����");
		System.out.println("����������������������");
		
		System.out.println("���Ȃ��̖��O����͂��Ă�������");
		String name=stdIn.next();
		
		if(name==null){
			//�܂������ݒ芮�����Ă��Ȃ�
			String nameAgain;
			for(int i=0; i<3; i++){
				System.out.println("���Ȃ��̖��O����͂��Ă�������");
					String nameAgain=stdIn.next();
				if(nameAgain != null){
					continue;
				}
			}name=nameAgain;
		}
		System.out.print(name + "����̍����̉^���́A");
		System.out.println(rnd);
		
	}
}

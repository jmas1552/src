package freshers2021;

import java.util.Scanner;

class MainProgram{
	
	public static final String EXCLAMATION_MARK="�I�I�I�I�I�I�I�I�I�I�I�I�I�I�I�I�I�I�I�I";
	public static final String EROOR_MESSAGE_ILLEGAL_INPUT="�s���Ȓl�����͂���܂����B�������I�����܂��B";
	public static final String BLANK_LINE="";
	public static final String GOOBY_MESSAGE="�܂��̂����p�����҂����Ă���܂�";
	public static final String THANKS_MESSAGE="�����p���肪�Ƃ��������܂���";
	
	
	public static void main(String[] args){
		
		mainScreen();
	}

		
		
		//���C�����
	public static void mainScreen(){
			
		Scanner stdIn=new Scanner(System.in);
		
		System.out.println("������ �v���O���~���O�̌��A�v���� �悤�����I������");
		System.out.println("1 : �������בւ��v���O����");
		System.out.println("2 : �ߕ��A���S���Y���v���O����");
		System.out.println("3 : �����̉^���v���O����");
		System.out.println("4 : �d�C���]�ԏ[�d�v���O����");
		System.out.println("5�F���ؗ��������v���O���� ");
		System.out.println("9 : �����I��");
		
		
		
		System.out.print("���s�������v���O�����ԍ���I�����Ă��������B(1-5,9)�F"); 
		int x=stdIn.nextInt();
	
		//�s������	
		if(x != 9 && !(x >= 1 && x <= 5)){
			System.out.println(EXCLAMATION_MARK);
			System.out.println(EROOR_MESSAGE_ILLEGAL_INPUT);
			System.out.println(EXCLAMATION_MARK);
			System.out.println(BLANK_LINE);
			System.out.println(GOOBY_MESSAGE);
		}
		//�����I��	
		if(x == 9){
			System.out.println(BLANK_LINE);
			System.out.println(GOOBY_MESSAGE);
			System.out.println(BLANK_LINE);	
		}
		
		try{
			//�������ёւ��v���O����
			if(x == 1){
				Num num = new Num();
				num.count();
				System.out.println(BLANK_LINE);
				System.out.println(THANKS_MESSAGE);
				System.out.println(GOOBY_MESSAGE);
			}
				//�ߕ��A���S���Y���v���O����
			else if(x == 2){
				JpnSpringFestival.algorithm();
				System.out.println(BLANK_LINE);
				System.out.println(THANKS_MESSAGE);
				System.out.println(GOOBY_MESSAGE);
			}
			//�����̉^���v���O����
			else if(x == 3){
// TODO				Fortune.today(); 
				System.out.println(BLANK_LINE);
				System.out.println(THANKS_MESSAGE);
				System.out.println(GOOBY_MESSAGE);
			}
			//�d�C���]�ԏ[�d�v���O����
			else if(x == 4){
// TODO				Car.battery();
				System.out.println(BLANK_LINE);
				System.out.println(THANKS_MESSAGE);
				System.out.println(GOOBY_MESSAGE);
			}
			//���ؗ��������v���O����
			else if(x == 5){
//	TODO			Chn.order();
				System.out.println(BLANK_LINE);
				System.out.println(THANKS_MESSAGE);
				System.out.println(GOOBY_MESSAGE);
			}	
		//��O����
		}catch(Exception e){
			System.out.println(BLANK_LINE);
			System.out.println(GOOBY_MESSAGE);
			System.out.println(BLANK_LINE);
		}
	}
}
	
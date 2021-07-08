package freshers2021;

import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

class Fortune {

	private static final String BEST_HAPPY = "大吉です。おめでとうございます！";
	private static final String SECOND_HAPPY = "吉です。";
	private static final String MIDDLE_HAPPY = "中吉です。";
	private static final String NEXT_TO_WORST_HAPPY = "小吉です";
	private static final String WORST_HAPPY = "凶です。ファイト！！";
	String name=null;
	Scanner stdIn=new Scanner(System.in);
	Random rand=new Random();
	
	public void  today(){

		System.out.println("＊＊＊＊＊＊＊＊＊＊＊");
		System.out.println("今日の運勢プログラム");
		System.out.println("＊＊＊＊＊＊＊＊＊＊＊");
		try {	
			for(int i=0; i<3; i++){
				System.out.print("あなたの名前を入力してください");
				name=stdIn.nextLine();

				if(name.isEmpty()){
					if(i==2) {
						System.out.println("！！！！！！！！！！！！！！！！！！！");
						System.out.println("名前の入力がなかったため、処理を終了します。");
						System.out.println("！！！！！！！！！！！！！！！！！！！");
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
		
		
		System.out.print(name + "さんの今日の運勢は、" );
	
		//乱数設定
		int rnd = rand.nextInt(10);
		
		if(0 <= rnd && rnd < 1) {
		 // 大吉
	 	bestHappy();
			}else if(1 <= rnd && rnd <= 2) {
		// 吉
				secondHappy();
			}else if(3 <= rnd && rnd <= 6){
		// 中吉
				middleHappy();
			}else if(6 < rnd && rnd <= 8){
		// 小吉
				secondUnHappy();
			}else if(8 < rnd && rnd <= 10){
		// 凶
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
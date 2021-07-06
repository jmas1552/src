package freshers2021;

import java.util.Scanner;
import java.util.Random;

import java.util. InputMismatchException;

public void today(){

	private final Random rand = new Random();
	public static final String BEST_HAPPY="大吉です。おめでとうございます！";
	public static final String SECOND_HAPPY="吉です。";
	public static final String MIDDLE_HAPPY="中吉です。";
	public static final String NEXT_TO_WORST_HAPPY="小吉です";
	public static final String WORST_HAPPY="凶です。ファイト！！";
	String name;
	Scanner stdIn=new Scanner(System.in);
	Random rand=new Random();

	
	public static void algorithm(){
		
			//乱数設定
 		int rnd = rand(10);
 			 if(0 <= rnd && rnd < 1) {
			 	return BEST_HAPPY;
  			}else if(1 < rnd && rnd <= 2) {
    		// 大吉
  				return SECOND_HAPPY;
  			}else if(2 < rnd && rnd <= 4){
    		// 吉
   				return MIDDLE_HAPPY;	
  			}else if(4 < rnd && rnd <= 6){
    		// 中吉
   				return NEXT_TO_WORST_HAPPY;
  			}else if(6 < rnd && rnd <= 8){
			// 小吉
   				return eItem_CopperCoin;
  			}else if(8 < rnd && rnd <= 10){
    		// 凶
   				return WORST_HAPPY;
		}
		
		System.out.println("＊＊＊＊＊＊＊＊＊＊＊");
		System.out.println("今日の運勢プログラム");
		System.out.println("＊＊＊＊＊＊＊＊＊＊＊");
		
		System.out.println("あなたの名前を入力してください");
		String name=stdIn.next();
		
		if(name==null){
			//まだ条件設定完了していない
			String nameAgain;
			for(int i=0; i<3; i++){
				System.out.println("あなたの名前を入力してください");
					String nameAgain=stdIn.next();
				if(nameAgain != null){
					continue;
				}
			}name=nameAgain;
		}
		System.out.print(name + "さんの今日の運勢は、");
		System.out.println(rnd);
		
	}
}

package freshers2021;

import java.util.Scanner;

class MainProgram{
	
	public static final String EXCLAMATION_MARK="！！！！！！！！！！！！！！！！！！！！";
	public static final String EROOR_MESSAGE_ILLEGAL_INPUT="不正な値が入力されました。処理を終了します。";
	public static final String BLANK_LINE="";
	public static final String GOOBY_MESSAGE="またのご利用をお待ちしております";
	public static final String THANKS_MESSAGE="ご利用ありがとうございました";
	
	
	public static void main(String[] args){
		
		mainScreen();
	}

		
		
		//メイン画面
	public static void mainScreen(){
			
		Scanner stdIn=new Scanner(System.in);
		
		System.out.println("＊＊＊ プログラミング体験アプリへ ようこそ！＊＊＊");
		System.out.println("1 : 数字並べ替えプログラム");
		System.out.println("2 : 節分アルゴリズムプログラム");
		System.out.println("3 : 今日の運勢プログラム");
		System.out.println("4 : 電気自転車充電プログラム");
		System.out.println("5：中華料理注文プログラム ");
		System.out.println("9 : 処理終了");
		
		
		
		System.out.print("実行したいプログラム番号を選択してください。(1-5,9)："); 
		int x=stdIn.nextInt();
	
		//不正入力	
		if(x != 9 && !(x >= 1 && x <= 5)){
			System.out.println(EXCLAMATION_MARK);
			System.out.println(EROOR_MESSAGE_ILLEGAL_INPUT);
			System.out.println(EXCLAMATION_MARK);
			System.out.println(BLANK_LINE);
			System.out.println(GOOBY_MESSAGE);
		}
		//処理終了	
		if(x == 9){
			System.out.println(BLANK_LINE);
			System.out.println(GOOBY_MESSAGE);
			System.out.println(BLANK_LINE);	
		}
		
		try{
			//数字並び替えプログラム
			if(x == 1){
				Num num = new Num();
				num.count();
				System.out.println(BLANK_LINE);
				System.out.println(THANKS_MESSAGE);
				System.out.println(GOOBY_MESSAGE);
			}
				//節分アルゴリズムプログラム
			else if(x == 2){
				JpnSpringFestival.algorithm();
				System.out.println(BLANK_LINE);
				System.out.println(THANKS_MESSAGE);
				System.out.println(GOOBY_MESSAGE);
			}
			//今日の運勢プログラム
			else if(x == 3){
// TODO				Fortune.today(); 
				System.out.println(BLANK_LINE);
				System.out.println(THANKS_MESSAGE);
				System.out.println(GOOBY_MESSAGE);
			}
			//電気自転車充電プログラム
			else if(x == 4){
// TODO				Car.battery();
				System.out.println(BLANK_LINE);
				System.out.println(THANKS_MESSAGE);
				System.out.println(GOOBY_MESSAGE);
			}
			//中華料理注文プログラム
			else if(x == 5){
//	TODO			Chn.order();
				System.out.println(BLANK_LINE);
				System.out.println(THANKS_MESSAGE);
				System.out.println(GOOBY_MESSAGE);
			}	
		//例外処理
		}catch(Exception e){
			System.out.println(BLANK_LINE);
			System.out.println(GOOBY_MESSAGE);
			System.out.println(BLANK_LINE);
		}
	}
}
	
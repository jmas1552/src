package freshers2021;

import java.util.Scanner;
import java.util.Random;

class Fortune {

	private static final String BEST_HAPPY = "大吉です。おめでとうございます！";
	private static final String SECOND_HAPPY = "吉です。";
	private static final String MIDDLE_HAPPY = "中吉です。";
	private static final String NEXT_TO_WORST_HAPPY = "小吉です";
	private static final String WORST_HAPPY = "凶です。ファイト！！";
	public static final String EXCLAMATION_MARK = "！！！！！！！！！！！！！！！！！！！！";
	public static final String EROOR_MESSAGE_ILLEGAL_INPUT = "不正な値が入力されました。処理を終了します。";
	public static final String NO_NAME_EROOR_MESSAGE = "名前の入力がなかったため、処理を終了します。";
	public static final String BLANK_LINE = "";
	String name = null;
	Scanner stdIn = new Scanner(System.in);
	Random rand = new Random();
	
	//	今日の運勢プログラムスタート
	public void startTodaysFortune() throws SubException, NotStartProgramException {
		//表題表示
		System.out.println("＊＊＊＊＊＊＊＊＊＊＊");
		System.out.println("今日の運勢プログラム");
		System.out.println("＊＊＊＊＊＊＊＊＊＊＊");
		try {
			//名前入力を要求
			for (int i = 0; i < 3; i++) {
				System.out.print("あなたの名前を入力してください。==>");
				name = stdIn.nextLine();
				//3回名前が未記入だったら例外処理にてプログラム終了
				if (name.isEmpty()) {
					if (i == 2) {
						throw new RuntimeException();
					}
				} else {
					//nameさんの今日の運勢表示
					System.out.print(name + "さんの今日の運勢は、");
					decideTodaysFortune();
					break;
				}
			}
		//3回名前記入だった際の例外処理
		} catch (RuntimeException e) {
			System.out.println(EXCLAMATION_MARK);
			System.out.println(NO_NAME_EROOR_MESSAGE);
			System.out.println(EXCLAMATION_MARK);
			throw new NotStartProgramException(e);
		//全般的な例外処理
		}catch (Exception e) {
			throw new SubException(e);
		}
	}
	
	//今日の運勢を決めるメソッド
	public void decideTodaysFortune() {
		// 乱数設定
		int rnd = rand.nextInt(10);

		if (0 <= rnd && rnd < 1) {
			// 大吉で表示するメッセージ
			System.out.print(BEST_HAPPY);
		} else if (1 <= rnd && rnd <= 2) {
			// 吉で表示するメッセージ
			System.out.print(SECOND_HAPPY);
		} else if (3 <= rnd && rnd <= 6) {
			// 中吉で表示するメッセージ
			System.out.print(MIDDLE_HAPPY);
		} else if (6 < rnd && rnd <= 8) {
			// 小吉で表示するメッセージ
			System.out.print(NEXT_TO_WORST_HAPPY);
		} else if (8 < rnd && rnd <= 10) {
			// 凶で表示するメッセージ
			System.out.print(WORST_HAPPY);
		}
	}
}
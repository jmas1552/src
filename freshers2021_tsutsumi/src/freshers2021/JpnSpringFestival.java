package freshers2021;

import java.util.Scanner;
import java.util.InputMismatchException;

class JpnSpringFestival {

	private static final String YES = "y";
	private static final String NO = "n";
	private static final String names[] = new String[6];
	private static final int beansNum[] = new int[6];
	Scanner stdIn = new Scanner(System.in);

	//節分アルゴリズム開始確認メソッド
	public void algorithm() throws SubException{

		names[0] = "じいちゃん";
		names[1] = "ばあちゃん";
		names[2] = "とうちゃん";
		names[3] = "かあちゃん";
		names[4] = "おれ";
		names[5] = "いもうと";

		// プログラム表題出力
		System.out.println("＊＊＊＊＊＊＊＊＊＊＊");
		System.out.println("節分アルゴリズムプログラム");
		System.out.println("＊＊＊＊＊＊＊＊＊＊＊");

		// 節分の日か確認
		System.out.println("今日は節分ですか(y/n)");
		try {
			String answer = stdIn.next();

			// 節分でない場合はサービス終了
			if (NO.equals(answer)) {
				System.out.println("本日は節分の日ではないので、終了します。");

				// 節分の日の対応
			} else if (YES.equals(answer)) {
				startAlgorithm();

				// 選択肢以外の入力があった際はエラーメッセージ表示
			} else {
				MainProgram.messageInputMismatch();
			}
			// 識別子に対応しない入力が発生した際は例外処理する
		} catch (InputMismatchException e) {
			MainProgram.messageInputMismatch();
		}
	}

	// 節分の日アルゴリズム開始　
	public void startAlgorithm() throws SubException{

		try {
			// 各人の年齢入力を要求
			for (int i = 0; i < beansNum.length; i++) {
				System.out.println(names[i] + "の年齢");
				beansNum[i] = stdIn.nextInt();
			//各人年齢100歳までとする（＝超えたものはエラーメッセージ表示）
				if (beansNum[i] > 100) {
					MainProgram.messageInputMismatch();
					System.exit(1);
				}
			}
			// 各人の食べた豆を表示
			for (int i = 0; i < beansNum.length; i++) {
				System.out.print("＊＊＊" + names[i] + "は豆を");
				System.out.println(beansNum[i] + "粒食べました＊＊＊");
			}
			//各人の食べた豆を条件に応じて加算していく
			int sum = 0;
			String beans100Piaces = null;
			String beans200Piaces = null;
			for (int j = 0; j < beansNum.length; j++) {
				sum += beansNum[j];

				// 100個目の豆を食べた人表示
				if (beans100Piaces == null && sum >= 100) {
					beans100Piaces = names[j];
					System.out.println("100粒目の豆を食べたひとは" + names[j]);

					// 200個目の豆を食べた人表示
				} else if (beans200Piaces == null && sum >= 200) {
					beans200Piaces = names[j];
					System.out.println("200粒目の豆を食べたひとは" + names[j]);
				}
			}
			if (sum < 100) {
				System.out.println("100粒目の豆を食べたひとはいません。");
			}
			if (sum < 200) {
				System.out.println("200粒目の豆を食べたひとはいません。");
			}
			// 家族全員が食べた豆の合計を表示
			System.out.print("家族全員で食べた豆の数は、");
			System.out.println(sum + "です");

			// 識別子に対応しない入力が発生した際は例外処理する
		} catch (InputMismatchException e) {
			MainProgram.messageInputMismatch() ;
			//全般的なエラーはメインプログラムで処理して終了
		}catch (Exception e) {
			throw new SubException(e);
		}
	}
}
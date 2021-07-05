package freshers2021;

import java.util.Scanner;
import java.util.InputMismatchException;

class JpnSpringFestival {

	private static final String YES = "y";
	private static final String NO = "n";
	public static final String names[] = new String[6];
	public static final int beansNum[] = new int[6];
	Scanner stdIn = new Scanner(System.in);
	
	public void algorithm() {
		

		names[0] = "じいちゃん";
		names[1] = "ばあちゃん";
		names[2] = "とうちゃん";
		names[3] = "かあちゃん";
		names[4] = "おれ";
		names[5] = "いもうと";

		System.out.println("＊＊＊＊＊＊＊＊＊＊＊");
		System.out.println("節分アルゴリズムプログラム");
		System.out.println("＊＊＊＊＊＊＊＊＊＊＊");

		System.out.println("今日は節分ですか(y/n)");
		String answer = stdIn.next();

		// 節分でない場合はサービス終了
		if (NO.equals(answer)) {
			System.out.println("本日は節分の日ではないので、終了します。");
			System.exit(0);
		} else if (YES.equals(answer)) {
			startAlgorithm();
		}
	}

	public void startAlgorithm() {

		try {
			for (int i = 0; i < beansNum.length; i++) {
				System.out.println(names[i] + "の年齢");
				beansNum[i] = stdIn.nextInt();
				if (beansNum[i] > 100) {
					System.exit(1);
				}
			}
			for (int i = 0; i < beansNum.length; i++) {
				System.out.print("＊＊＊" + names[i] + "は豆を");
				System.out.println(beansNum[i] + "粒食べました＊＊＊");
			}
			int sum = 0;
			String beans100Piaces = null;
			String beans200Piaces = null;
			for (int j = 0; j < beansNum.length; j++) {
				sum += beansNum[j];
				if (beans100Piaces == null && sum >= 100) {
					beans100Piaces = names[j];
					System.out.println("100粒目の豆を食べたひとは" + names[j]);
				} else if (beans200Piaces == null && sum >= 200) {
					beans200Piaces = names[j];
					System.out.println("200粒目の豆を食べたひとは" + names[j]);
				}
			}
			System.out.print("家族全員で食べた豆の数は、");
			System.out.println(sum + "です");
		} catch (InputMismatchException e) {
			System.out.println(MainProgram.EXCLAMATION_MARK);
			System.out.println(MainProgram.EROOR_MESSAGE_ILLEGAL_INPUT);
			System.out.println(MainProgram.EXCLAMATION_MARK);
			System.exit(1);
		}
	}
}
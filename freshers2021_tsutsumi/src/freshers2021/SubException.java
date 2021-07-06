package freshers2021;

public class SubException extends Exception{
		//warningを回避するための宣言
		private static final long serialVersionUID = 1L; 

		// コンストラクタ
		SubException(String msg){
			super(msg);
		}
	}

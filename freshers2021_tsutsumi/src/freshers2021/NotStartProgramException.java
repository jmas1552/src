package freshers2021;

public class NotStartProgramException extends RuntimeException {
		 
		//serialVersionUID。warning回避のため記述。
		private static final long serialVersionUID = 1L;
		
		public NotStartProgramException(Exception cause) {
			 super(cause);
}
}

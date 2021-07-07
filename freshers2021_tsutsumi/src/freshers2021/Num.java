package freshers2021;

import java.util.Scanner;
import java.util.Arrays;
import java.util. InputMismatchException;

class Num{
	
	private static final String YES= "y";
	private static final String NO="n";
	Scanner stdIn=new Scanner(System.in);
	
	public void count(){
		
	

		
		System.out.println("＊＊＊＊＊＊＊＊＊＊＊");
		System.out.println("数字並び替えプログラム");
		System.out.println("＊＊＊＊＊＊＊＊＊＊＊");
		
		try{
			System.out.println("昇順に並び替えますか(y/n)");
			String d=stdIn.next();
		

		
			//数字の並び替えを昇順、降順以外に選んだ際にエラーを出力する
		
			if(!(d.equals(YES) || d.equals(NO))){
				System.out.println(MainProgram.EXCLAMATION_MARK);
				System.out.println(MainProgram.EROOR_MESSAGE_ILLEGAL_INPUT);
				System.out.println(MainProgram.EXCLAMATION_MARK);
				System.exit(1);
			}
			//並べ替えしたい数字の個数を決める
			System.out.print("並べ替えしたい数字の数はいくつですか？(2-5)");   			
			int x = stdIn.nextInt();	
			int num[] = new int[x];
			
			if(!(x >= 2  &&  x <= 5)){
				System.out.println(MainProgram.EXCLAMATION_MARK);
				System.out.println(MainProgram.EROOR_MESSAGE_ILLEGAL_INPUT);
				System.out.println(MainProgram.EXCLAMATION_MARK);
				System.exit(1);
			}
			//並べ替えする数字を決める
			for(int i=0; i < x ;i++){
				System.out.print((i+1) + "つ目:");
				num[i]=stdIn.nextInt();
				
				if(num[i] < 0 || num[i] > 100){
					System.out.println(MainProgram.EXCLAMATION_MARK);
					System.out.println(MainProgram.EROOR_MESSAGE_ILLEGAL_INPUT);
					System.out.println(MainProgram.EXCLAMATION_MARK);
					System.exit(1);
				}
			}
			Arrays.sort(num); 
			//昇順
			if(d.equals(YES)){

				System.out.println("昇順に並び替えます！"); 
    			System.out.println(Arrays.toString(num));
			}else if(d.equals(NO)){
				//降順  
				System.out.print("降順に並び替えます！[");
				int [] reverse=new int[x];
				int rNum =x ;
				rNum -= 1;
				
		 		for(int i = rNum ; i>=0 ; i--){
		 			reverse[rNum-i]=num[i];
		 			System.out.print(reverse[rNum-i] + ",");
		 		}
				System.out.print("]");
			}

		}catch(InputMismatchException e){
			System.out.println(MainProgram.EXCLAMATION_MARK);
			System.out.println(MainProgram.EROOR_MESSAGE_ILLEGAL_INPUT);
			System.out.println(MainProgram.EXCLAMATION_MARK);
		}
		
	}
}
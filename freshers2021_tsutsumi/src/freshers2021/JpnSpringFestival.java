package freshers2021;
import java.util.Scanner;
import java.util. InputMismatchException;

class JpnSpringFestival{
	
	private static final String YES= "y";
	private static final String NO="n";


	
	public static void algorithm(){
		Scanner stdIn=new Scanner(System.in);

		String Name[]=new String[6];
		int beansNum[]=new int[6];
		
		Name[0]="じいちゃん";
		Name[1]="ばあちゃん";
		Name[2]="とうちゃん";
		Name[3]="かあちゃん";
		Name[4]="おれ";
		Name[5]="いもうと";
		
		System.out.println("＊＊＊＊＊＊＊＊＊＊＊");
		System.out.println("節分アルゴリズムプログラム");
		System.out.println("＊＊＊＊＊＊＊＊＊＊＊");
		
		try{
			System.out.println("今日は節分ですか(y/n)");
			String answer=stdIn.next();
			
			if(NO.equals(answer)){
				System.out.println("終了します。");
				System.exit(0);
			}
			
			for(int i=0; i < beansNum.length; i++) {
					System.out.println(Name[i] + "の年齢");
					beansNum[i]=stdIn.nextInt();
					if(beansNum[i]>100){
						System.exit(1);
					}
			}
			int count=0;
			for(int j=0; j<beansNum.length; j++){  
				count +=beansNum[j];
				if(count >=100){
					System.out.print("100粒目の豆を食べたひとは、");
					System.out.println(Name[j]+ "です");
				}else{
					System.out.print("100粒目の豆を食べたひとはいません。");
				}
			}
			int countTwohundred=0;
			for(int m=0; m<beansNum.length; m++){  
				countTwohundred +=beansNum[m];
				if(countTwohundred >=200){
					System.out.print("200粒目の豆を食べたひとは、");
					System.out.println(Name[m]+ "です");
				}else{
					System.out.print("100粒目の豆を食べたひとはいません。");				
				}	
			}	
			
			int sum=0;
			for(int n=0; n<beansNum.length; n++){
				sum +=beansNum[n];
			}
			System.out.print("家族全員で食べた豆の数は、");
			System.out.println(sum + "です");	
			
		}catch(InputMismatchException e){
			System.out.println(MainProgram.EXCLAMATION_MARK);
			System.out.println(MainProgram.EROOR_MESSAGE_ILLEGAL_INPUT);
			System.out.println(MainProgram.EXCLAMATION_MARK);
			System.exit(1);
		}
	}
}
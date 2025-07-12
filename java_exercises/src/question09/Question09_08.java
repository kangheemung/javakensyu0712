package question09; 
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; 
 

	public class Question09_08 { 
		 public static void main(String[] args) throws IOException { 
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   
		 
		 System.out.println("1 以上の数値を入力してください"); 
		 String str = br.readLine(); 
		 int num = Integer.parseInt(str); 
		 
		 boolean errFlag = false; 
		 if (num==0) {System.out.println("0です。。。");}
		 else if(num %2==0) {
			 System.out.println(num+"は偶数です。" ); 
		 } else if (num %2!=0) { 
		 System.out.println(num + "奇数です。"); 
		 } else {
			 System.out.println("もう一度チャレンジです"); 
		 }
	}
}
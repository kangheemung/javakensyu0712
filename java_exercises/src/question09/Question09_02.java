package question09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question09_02 {

	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("数入力して下さい。");
		BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
		
		String str = reader.readLine(); 
		int number = Integer.parseInt(str);
		// TODO 自動生成されたメソッ=ド・スタブ
//		実行結果１ 
//		number の値は 10 以上です 
//		処理を終了します 
		if (number>=30) {
			System.out.println("number の値は 30 以上です");
			System.out.println("処理を終了します");
			
		}else {
		System.out.println("number の値は 30 未満です ");
		System.out.println("処理を終了します");
		}

	}

}

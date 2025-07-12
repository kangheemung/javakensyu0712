package question03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question03_01 {

	 public static void main(String[] args) throws IOException { 
	        System.out.println("キーボードから値を 3 回入力下さい。"); 
//	      
	        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
	        String str = reader.readLine(); 
	        String str1 = reader.readLine();
	        String str2 = reader.readLine();
//		コンソール上に実行結果を表示するコードを記述しましょう。 
//		その際、キーボードから入力された値を小数に変換し、使用してください。 
//		記述にあたっては以下の仕様に従うものとします。 
		
		
		System.out.print(str +str1+ str2);
	}

}

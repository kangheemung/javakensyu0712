package lesson08;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; 

public class Sample0805 {

	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("数入力して下さい。");
		BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
		
		String str = reader.readLine(); 
		int num = Integer.parseInt(str);
		
		if (num == 4 ) {			
			System.out.println("4が入力されました。");
				
		} else if (num == 7 ){
			System.out.println("7が入力されました。");
		} else {
			System.out.println("4と7以外の数字が入力されました。");
		}
  }
}

package lesson08;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; 

public class Sample0802 {

	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("入力して下さい。");
		BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine(); 
		int res = Integer.parseInt(str);
		if (res==5) {
			System.out.println(str+ "が入力されました。");
			System.out.println("式の評価値は「true」です。");
		}
		System.out.println("システムを終了します。"); 
	}

}

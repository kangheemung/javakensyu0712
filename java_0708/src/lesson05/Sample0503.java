package lesson05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample0503 {

	public static void main(String[] args) throws IOException{
		System.out.println("文字列３つ入力して下さい。");
		BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
		
		String str1= reader.readLine();
		String str2= reader.readLine();
		String str3= reader.readLine();
		System.out.println(str1+"入力されました。");
		System.out.println(str2+"入力されました。");
		System.out.println(str3+"入力されました。");
		
		// TODO 自動生成されたメソッド・スタブ

	}

}

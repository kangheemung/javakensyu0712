package question06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//下記プログラムは入力された値によって条件分岐するプログラムです。 
//if～else 文の部分を、条件演算子を使用する形に修正しましょう。 
//記述にあたっては以下の仕様に従うものとします。 

public class Question06_02 {
	 public static void main(String[] args) throws IOException { 
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   
		 
		 System.out.println("整数を入力してください。"); 
		 String str1 = br.readLine(); 
		 int num = Integer.parseInt(str1); 
		  String result= (num%10 == 0) ? "20 は 10 の倍数です。 ":"21 は 10 の倍数ではありません。"; 
		  System.out.println(result);
	 }
}

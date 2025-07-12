package question04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question04_01 {

    public static void main(String[] args) throws IOException { 
        System.out.println("数字を入力してください。"); 
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 

      
            int str =Integer.parseInt(reader.readLine());
//		コンソール上から任意の数字を入力し、0.7 をかけてから「3 割引きで〇〇円です」と出力するプログラムを記 
//		述しましょう。 
//		その際、計算結果の小数点以下の値は切り捨ててください。 
//		記述にあたっては以下の仕様に従うものとします。
        
            double num = str * 0.7;
           System.out.println(" 3 割引きで"+num+"円です");
//	

	}

}

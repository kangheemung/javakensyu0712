package question04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question04_02 {

    public static void main(String[] args) throws IOException { 
        System.out.println("数字を入力してください。"); 
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 

      
            int str =Integer.parseInt(reader.readLine());
            int str1 =Integer.parseInt(reader.readLine());
            int str2 =Integer.parseInt(reader.readLine());
//		3 つの任意の数字（商品の値段）を入力すると、以下の値を計算して出力するプログラムを記述しましょう。 
//
// 
//
// 各商品の 3 割引き価格の合計値 
//上記の合計値の平均値 
//
// 
//
//その際、計算結果の小数点以下の値は切り捨ててください。 
//記述にあたっては以下の仕様に従うものとします。
        
            double num = (str+str1+str2) * 0.7;
            double num1 = num/3;
           System.out.println(" 合計"+num+"円");
           System.out.println(" 平均"+num1+"円");
//	

	}

}

package question09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question09_03 {
//	1 変数 point に 80 以上の数値が代入されている場合は実行結果１を表示し、 
//	80 未満 50 以上の数値の場合は実行結果２を表示し、 
//	50 未満 30 以上の数値の場合は実行結果３を表示し、 
//	それ以外の数値の場合は実行結果４を表示する処理の流れを示すフローチャートをノートに描きましょう。 
//
//	 
//
//	2 作成したフローチャートに基づいてコードを記述しましょう。 
//	コードの記述にあたっては以下の仕様に従うものとします。

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
		if (number>=80) {
			System.out.println("テストの点数は優秀です");
			System.out.println("お疲れ様でした");
			
		}else if(80>number&&number>=50){
		System.out.println("テストの点数は平均的です");
		System.out.println("お疲れ様でした");
		}else if (50>number&&number>=30){
			System.out.println("テストの点数が及第です ");
			System.out.println("お疲れ様でした");
			
		}else {
			System.out.println("赤点のため追試が必要です");
			System.out.println("お疲れ様でした");
		}

	}

}

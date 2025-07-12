package question05;

public class Question05_02 {
//	下記プログラムは int 型の配列を 2 種類宣言しています。 
//	二次元配列を使用する形に修正し、配列宣言を 1 つにしましょう。 
//	その後、実行結果の通りにコンソール上に表示しましょう。 
//	記述にあたっては以下の仕様に従うものとします。 
	public static void main(String[] args) {
		

			
		 int [][]  num1={
				 {10,20,30},
				 {40,50,60}};
		 
		 System.out.println("1 段目の1つ目の値は" + num1[0][0]); 
		 System.out.println("1 段目の2つ目の値は" + num1[0][1]); 
		 System.out.println("1 段目の3つ目の値は" + num1[0][2]); 
		 System.out.println("2 段目の1つ目の値は" + num1[1][0]); 
		 System.out.println("2 段目の2つ目の値は" + num1[1][1]); 
		 System.out.println("2 段目の3つ目の値は" + num1[1][2]); 
			 
	}

}

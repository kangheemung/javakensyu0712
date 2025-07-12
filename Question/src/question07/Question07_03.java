package question07;

public class Question07_03 {
    public static void main(String[] args) {
//    	下記プログラムは配列の要素の中身を昇順にソートするプログラムです。 
//    	for 文のネストを使用している構文を sort()メソッドを使用するコードに修正しましょう。 
//    	また、配列を標準出力している for 文を拡張 for 文に修正しましょう。 
//    	記述にあたっては以下の仕様に従うものとします。
    	 int[] num = {30, 53, 21, 70,60}; 
    	 
    	 for (int i = 0; i < num.length - 1; i++) { 
	    	System.out.println(num[i]);
	    	
    	 } 
    	 System.out.println("ソートが完了しました"); 
    	 
    	 for (int i = 0; i < num.length; i++) { 
    	 System.out.print(num[i] + " "); 
    	 } 
}
}

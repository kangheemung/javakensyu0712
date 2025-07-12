package question07;

import java.util.Arrays;

public class Question07_04 {
    public static void main(String[] args) {
        int[] num = {30, 53, 21, 70, 60}; // 初期化された配列

        // sort()メソッドを使用してソート
        Arrays.sort(num);

        // ソート完了後のメッセージを表示
        System.out.println("ソートが完了しました");

        // 結果を出力
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }
}

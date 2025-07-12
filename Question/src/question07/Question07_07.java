package question07;

public class Question07_07 {
    public static void main(String[] args) {
        int rows = 8; // 行数を定義

        for (int i = 1; i <= rows; i++) { // 外側ループ（行を制御）
            if (i % 2 == 1) { // 奇数行の場合
                for (int j = rows - i; j > 0; j--) { // 空白を出力
                    System.out.print("　");
                }
                for (int k = 1; k <= (2 * i - 1); k++) { // ■を出力
                    System.out.print("■");
                }
            } else { // 偶数行の場合
                for (int j = rows - i; j > 0; j--) { // 空白を出力
                    System.out.print("　");
                }
                for (int k = 1; k <= (2 * i - 1); k++) { // □を出力
                    System.out.print("□");
                }
            }
            System.out.println(); // 改行
        }
    }
}

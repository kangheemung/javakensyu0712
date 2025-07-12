package question07;

public class Question07_01 {

    public static void main(String[] args) {
       
        int[][] numArray = new int[9][9];

        // 配列に掛け算の結果を格納
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                numArray[i][j] = (i + 1) * (j + 1); 
                // i+1とj+1を掛け算
            }
        }

        // コンソールに出力
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(numArray[i][j] + " "); // 値をスペース区切りで出力
            }
            System.out.println(); // 行ごとに改行
        }
    }
}

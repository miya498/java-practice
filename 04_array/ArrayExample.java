/**
 * 配列の例
 * 配列の定義と基本的な操作方法を示します
 */
public class ArrayExample {
    public static void main(String[] args) {
        // 配列の宣言と初期化
        int[] numbers = {1, 2, 3, 4, 5};
        
        // 配列の要素にアクセス
        System.out.println("最初の要素: " + numbers[0]);
        System.out.println("最後の要素: " + numbers[numbers.length - 1]);
        
        // 配列の要素を変更
        numbers[2] = 10;
        System.out.println("変更後の3番目の要素: " + numbers[2]);
        
        // 配列の要素をループで処理
        System.out.println("\n配列の全要素:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }
        
        // 2次元配列の例
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        // 2次元配列の要素を表示
        System.out.println("\n2次元配列の要素:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        // 配列の長さを取得
        System.out.println("\n配列の長さ: " + numbers.length);
        System.out.println("2次元配列の行数: " + matrix.length);
        System.out.println("2次元配列の列数: " + matrix[0].length);
    }
} 
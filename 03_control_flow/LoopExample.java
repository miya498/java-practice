/**
 * ループの例
 * for文とwhile文の基本的な使用方法を示します
 */
public class LoopExample {
    public static void main(String[] args) {
        // for文の例
        System.out.println("for文の例：");
        for (int i = 1; i <= 5; i++) {
            System.out.println("カウント: " + i);
        }
        
        // 配列の要素をfor文で処理
        String[] fruits = {"りんご", "バナナ", "オレンジ"};
        System.out.println("\n配列の要素をfor文で処理：");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("フルーツ " + (i + 1) + ": " + fruits[i]);
        }
        
        // 拡張for文の例
        System.out.println("\n拡張for文の例：");
        for (String fruit : fruits) {
            System.out.println("フルーツ: " + fruit);
        }
        
        // while文の例
        System.out.println("\nwhile文の例：");
        int count = 1;
        while (count <= 3) {
            System.out.println("カウント: " + count);
            count++;
        }
        
        // do-while文の例
        System.out.println("\ndo-while文の例：");
        int number = 1;
        do {
            System.out.println("数字: " + number);
            number++;
        } while (number <= 3);
    }
} 
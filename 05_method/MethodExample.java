/**
 * メソッドの例
 * メソッドの定義と呼び出しの基本的な使用方法を示します
 */
public class MethodExample {
    public static void main(String[] args) {
        // 引数なしのメソッド呼び出し
        printHello();
        
        // 引数ありのメソッド呼び出し
        int sum = add(5, 3);
        System.out.println("5 + 3 = " + sum);
        
        // 複数の引数を持つメソッド呼び出し
        double average = calculateAverage(85, 90, 95);
        System.out.println("平均点: " + average);
        
        // 戻り値なしのメソッド呼び出し
        printName("田中太郎", 25);
    }
    
    // 引数なし、戻り値なしのメソッド
    public static void printHello() {
        System.out.println("こんにちは！");
    }
    
    // 引数あり、戻り値ありのメソッド
    public static int add(int a, int b) {
        return a + b;
    }
    
    // 複数の引数を持つメソッド
    public static double calculateAverage(int score1, int score2, int score3) {
        return (score1 + score2 + score3) / 3.0;
    }
    
    // 複数の引数を持つ戻り値なしのメソッド
    public static void printName(String name, int age) {
        System.out.println("名前: " + name);
        System.out.println("年齢: " + age + "歳");
    }
} 
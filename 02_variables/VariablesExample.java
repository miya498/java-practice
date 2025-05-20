/**
 * 変数とデータ型の例
 * Javaの基本的なデータ型と変数の使用方法を示します
 */
public class VariablesExample {
    public static void main(String[] args) {
        // 整数型
        int age = 25;
        long population = 7800000000L;  // 大きな整数はLを付ける
        
        // 浮動小数点型
        double height = 170.5;
        float weight = 65.5f;  // float型はfを付ける
        
        // 文字型
        char grade = 'A';
        
        // 真偽値
        boolean isStudent = true;
        
        // 文字列（参照型）
        String name = "田中太郎";
        
        // 変数の値を出力
        System.out.println("名前: " + name);
        System.out.println("年齢: " + age + "歳");
        System.out.println("身長: " + height + "cm");
        System.out.println("体重: " + weight + "kg");
        System.out.println("成績: " + grade);
        System.out.println("学生ですか: " + isStudent);
    }
} 
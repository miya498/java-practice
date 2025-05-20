/**
 * if文の例
 * 条件分岐の基本的な使用方法を示します
 */
public class IfExample {
    public static void main(String[] args) {
        int score = 85;
        
        // 基本的なif文
        if (score >= 60) {
            System.out.println("合格です！");
        }
        
        // if-else文
        if (score >= 80) {
            System.out.println("優秀です！");
        } else {
            System.out.println("もう少し頑張りましょう。");
        }
        
        // if-else if-else文
        if (score >= 90) {
            System.out.println("評価：S");
        } else if (score >= 80) {
            System.out.println("評価：A");
        } else if (score >= 70) {
            System.out.println("評価：B");
        } else if (score >= 60) {
            System.out.println("評価：C");
        } else {
            System.out.println("評価：D");
        }
        
        // 三項演算子の例
        String result = (score >= 60) ? "合格" : "不合格";
        System.out.println("結果: " + result);
    }
} 
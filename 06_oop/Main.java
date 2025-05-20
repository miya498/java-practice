/**
 * Mainクラス
 * Personクラスの使用例を示すメインクラス
 */
public class Main {
    public static void main(String[] args) {
        // Personオブジェクトの作成
        Person person1 = new Person("田中太郎", 25, "プログラマー");
        Person person2 = new Person("佐藤花子", 30, "デザイナー");
        
        // オブジェクトのメソッド呼び出し
        System.out.println("=== 自己紹介 ===");
        person1.introduce();
        person2.introduce();
        
        // ゲッターの使用
        System.out.println("\n=== 情報の取得 ===");
        System.out.println(person1.getName() + "の年齢: " + person1.getAge() + "歳");
        System.out.println(person2.getName() + "の職業: " + person2.getOccupation());
        
        // セッターの使用
        System.out.println("\n=== 情報の更新 ===");
        person1.setAge(26);
        person2.setOccupation("UIデザイナー");
        
        // 更新後の情報表示
        person1.introduce();
        person2.introduce();
        
        // メソッドの使用
        System.out.println("\n=== 誕生日 ===");
        person1.haveBirthday();
        person2.haveBirthday();
    }
} 
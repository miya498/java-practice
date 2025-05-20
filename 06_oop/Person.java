/**
 * Personクラス
 * オブジェクト指向プログラミングの基本的な例を示すクラス
 */
public class Person {
    // フィールド（インスタンス変数）
    private String name;
    private int age;
    private String occupation;
    
    // コンストラクタ
    public Person(String name, int age, String occupation) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }
    
    // ゲッターメソッド
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getOccupation() {
        return occupation;
    }
    
    // セッターメソッド
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
    
    // インスタンスメソッド
    public void introduce() {
        System.out.println("はじめまして、" + name + "です。");
        System.out.println("年齢は" + age + "歳で、" + occupation + "をしています。");
    }
    
    // 年齢を1つ増やすメソッド
    public void haveBirthday() {
        age++;
        System.out.println(name + "の誕生日です。年齢が" + age + "歳になりました。");
    }
} 
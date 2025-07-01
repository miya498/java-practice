public class Main {
    public static void main(String[] args){
        Wizard w = new Wizard();
        Matango m = new Matango('A');
        Character c = new Wizard();
        w.name = "アガサ";
        w.attack(m);
        w.fireball(m);

        c.name = "小川";
        c.attack(m);
        // ここでコンパイルエラー
        c.fireball(m);
    }
}

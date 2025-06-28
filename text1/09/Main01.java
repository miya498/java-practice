public class Main01 {
    public static void main(String[] args){
        Hero h1 = new Hero();
        h1.hp = 100;
        Hero h2;
        h2 = h1;
        h2.hp = 200;
        // h1とh2は同じインスタンスを参照しているため、どちらのhpも200になる
        System.out.println("h1のHPは" + h1.hp);
        System.out.println("h2のHPは" + h2.hp);
    }
}

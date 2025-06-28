public class Main03 {
    public static void main(String[] args){
        Hero h1 = new  Hero("湊");
        System.out.println(h1.name + "のHPは" + h1.hp);
        Hero h2 = new Hero();
        h2.hp = 150;
        System.out.println(h2.name + "のHPは" + h2.hp);
        Wizard w = new Wizard();
        w.name = "美咲";
        w.hp = 50;
        w.heal(h1);
        w.heal(h1);
        w.heal(h2);
    }
}

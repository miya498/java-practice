public class PoisonMatango extends Matango{
    int attackCount = 5;
    public PoisonMatango(char suffix){
        super(suffix);
    }

    public void attack(Hero h){
        super.attack(h);
        if (attackCount != 0){
            System.out.println("さらに毒の胞子をばらまいた！");
            int damage = h.hp/5;
            h.hp -= damage;
            System.out.println(damage + "ポイントのダメージ！");
            attackCount -= 1;
        }
    }
    
}

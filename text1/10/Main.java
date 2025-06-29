public final class Main {
    public static void main(String[] args){
        Weapon w = new Weapon();
        Hero h = new Hero();
        SuperHero sh = new SuperHero();

        sh.hp = 100;
        h.run();
        sh.run();

        PoisonMatango pm = new PoisonMatango('A');
        pm.attack(sh);
    }
}

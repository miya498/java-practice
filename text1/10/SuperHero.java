public class SuperHero extends Hero{
    boolean flying;
    public void fly(){
        this.flying = true;
        System.out.println("飛び上がった");
    }

    public void land(){
        this.flying = false;
        System.out.println("着地した");
    }

    //親クラスにも定義してあるので、再定義

    public void run(){
        System.out.println(this.name + "は撤退した");
    }

    public void attack(Matango m){
        super.attack(m);
        if(this.flying){
            super.attack(m);
        }
    }

    public SuperHero(){
        System.out.println("SuperHeroのコンストラクタが動作");
    }
}
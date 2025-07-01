public class Hero {
    //属性の定義
    String name = "湊";
    int hp;

    //操作の定義
    // Matangoのようにモンスターごとにattack()を作成せず、ザックリモンスターを捉える
    public void attack(Monster m){
        System.out.println(this.name + "の攻撃!");
        m.hp -= 5;
        System.out.println("5ポイントのダメージを与えた");
    }

    public void run(){
        System.out.println(this.name + "は逃げ出した！");
    }

    public final void slip(){
        this.hp -= 5;
        System.out.println(this.name + "は転んだ！");
        System.out.println("5のダメージ");
    }

    public Hero(){
        System.out.println("Heroのコンストラクタが動作");
    }
}

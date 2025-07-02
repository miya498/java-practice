public class Hero {
    private int hp;
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name){
        if(name == null){
            throw new IllegalArgumentException("名前がnullである。処理を中断");
        }
        if(name.length() <= 1){
            throw new IllegalArgumentException("名前が短すぎる。処理を中断");
        }
        if(name.length() >= 8){
            throw new IllegalArgumentException("名前が長すぎる。処理を中断");
        }
        this.name = name;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp){
        this.hp = hp;
    }

    public void bye() {
        System.out.println("勇者は別れを告げた");
    }
    //外部クラスから呼び出せない
    private void die(){
        System.out.println(this.name + "は死んでしまった");
        System.out.println("GAME OVER");
    }

    public void run(){
        System.out.println(this.name + "は逃げ出した！");
    }

    public final void slip(){
        this.hp -= 5;
        System.out.println(this.name + "は転んだ！");
        System.out.println("5のダメージ");
    }

    public void sleep(){
        this.hp = 100;
        System.out.println(this.name + "は眠って回復した");
    }

}

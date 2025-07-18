public class Wizard {
    private int hp;
    private int mp;
    private String name;
    private Wand wand;
    public void heal(Hero h){
        int basePoint = 10;
        int recovPoint = (int)(basePoint * this.getWand().getPower());

        h.setHp(h.getHp() + recovPoint);
        System.out.println(h.getName() + "のHPを" + recovPoint + "回復した");
    }

    public int getHp() { return this.hp;}
    public void setHp(int hp) {
        if (hp < 0){
            hp = 0;
        }
        this.hp = hp;
    }

    public int getMp() { return this.mp; }
    public void setMp(int mp) {
        if (mp < 0){
            mp = 0;
        }
        this.mp = mp;
    }

    public String getName() { return this.name; }
    public void setName(String name) {
        if (name == null || name.length() < 3){
            throw new IllegalArgumentException("名前が3文字以下です。処理を中断します。");
        }
        this.name = name;
    }

    public Wand getWand() { return this.wand; }
    public void setWand(Wand wand) {
        if (wand == null){
            throw new IllegalArgumentException("設定されている杖がnullです");
        }
        this.wand = wand;}
}

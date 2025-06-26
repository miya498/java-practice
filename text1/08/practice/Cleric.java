public class Cleric {
    String name;
    int hp = 50;
    final int hp_max = 50;
    int mp = 10;
    final int mp_max = 10;

    public void selfAid(){
        System.out.println(this.name + "はセルフエイドを唱えた!");
        this.mp -= 5;
        this.hp = this.mp_max;
        System.out.println("HPが最大まで回復した。");
    }

    public int pray(int sec){
        System.out.println(this.name + "は" + sec + "秒間祈った!");
        int heal = new java.util.Random().nextInt(2) + sec;
        heal = Math.min(this.mp_max - this.mp,heal);
        System.out.println("MPが" + heal + "回復した。");
        return heal;
    }
}

public class Main {
    public  static void main(String[] args){
        Cleric c = new Cleric();
        c.name = "高橋";
        System.out.println(c.name + "が誕生した。");
        c.selfAid();
        c.pray(3);
    }
}

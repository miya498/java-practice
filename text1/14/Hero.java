public class Hero {
    String name;
    int hp;
    static int money;

    public static void setRandomMoney(){
        Hero.money = (int)(Math.random() * 1000);
    }

    public boolean equals(Object o){
        if (this == o){ return true; }

        if (o instanceof Hero h){
            if (this.name.equals(h.name)){
                return true;
            }
        }
        return false;
    }

}

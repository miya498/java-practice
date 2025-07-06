import java.util.*;

public class Main01 {
    public static void main(String[] args){
        Hero h1 = new Hero("斎藤");
        Hero h2 = new Hero("鈴木");

        Map<Hero,Integer> list = new HashMap<>();
        list.put(h1,3);
        list.put(h2,7);

        for (Hero key: list.keySet()){
            System.out.println( key.getName() + "が倒した敵の数は" + list.get(key));
        }
    }
}

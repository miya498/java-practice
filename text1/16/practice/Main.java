import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Hero h1 = new Hero("斎藤");
        Hero h2 = new Hero("鈴木");

        List<Hero> list = new ArrayList<Hero>();
        list.add(h1);
        list.add(h2);

        for (int i=0;i<2;i++){
            System.out.println( (i+1) + "人目は" + list.get(i).getName());
        }
    }
}

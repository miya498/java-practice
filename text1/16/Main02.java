import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashSet;
import java.util.Set;

public class Main02 {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<>();
        names.add("miya");
        names.add("vhika");
        names.add("aruba");

        Iterator<String> it = names.iterator();
        while(it.hasNext()){
            String e = it.next();
            System.out.println(e);
        }
        Set<String> colors = new HashSet<>();
        colors.add("赤");
        colors.add("青");
        colors.add("黄");
        colors.add("青");
        System.out.println("色は" + colors.size() + "種類");

        for(String color:colors){
            System.out.println(color + "→");
        }


    }
}

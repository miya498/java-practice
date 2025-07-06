import java.util.ArrayList;

public class Main01 {
    public static void main(String[] args){
        ArrayList<Integer> points = new ArrayList<Integer>();
        points.add(10);
        points.add(20);
        points.add(30);
        for (int i:points){
            System.out.println(i);
        }
        for(int i=0; i<points.size(); i++){
            System.out.println(points.get(i));
        }
    }
}

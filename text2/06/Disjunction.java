public class Disjunction {
    public static void main(String[] args){
        boolean a = Boolean.parseBoolean(args[0]);
        boolean b = Boolean.parseBoolean(args[1]);
        System.out.println("答えは:" + (a || b));
    }
}

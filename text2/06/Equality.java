public class Equality {
    public static void main (String[] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        if (a==b){
            System.out.println("答えは:" + true);
        }else{
            System.out.println("答えは:" + false);
        }
    }
}

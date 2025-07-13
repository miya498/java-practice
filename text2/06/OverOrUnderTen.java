public class OverOrUnderTen {
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        if (a == 10){
            System.out.println(a + "は10と同じ値です");
        }else if(a < 10){
            System.out.println(a + "は10より小さい値です");
        }else{
            System.out.println(a + "は10より大きい値です");
        }
    }
}

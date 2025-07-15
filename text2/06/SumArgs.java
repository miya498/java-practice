public class SumArgs {
    public static void main(String[] args){
        double sum = 0;
        for(int i=0;i<args.length;i++){
            double a = Double.parseDouble(args[i]);
            sum += a;
        }
        System.out.println("合計: " + sum);
    }
}

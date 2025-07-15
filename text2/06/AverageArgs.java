public class AverageArgs {
    public static void main(String[] args){
        double sum = 0;
        for(int i=0;i<args.length;i++){
            double a = Double.parseDouble(args[i]);
            sum += a;
        }
        double average = sum/args.length;
        System.out.println("平均: " + average);
    }
}

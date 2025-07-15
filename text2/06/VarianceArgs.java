public class VarianceArgs {
    public static void main(String[] args){
        double sum = 0;
        for(int i=0;i<args.length;i++){
            double a = Double.parseDouble(args[i]);
            sum += a;
        }
        double average = sum/args.length;
        double variance = 0;
        for(int i=0;i<args.length;i++){
            double a = Double.parseDouble(args[i]);
            variance += Math.pow((a-average),2);
        }
        System.out.println("分散: " + (variance/args.length));
    }
}

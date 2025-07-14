public class SquareRoot {
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        int cnt = 0;
        double left = 0;
        double right = a;
        while(cnt < 100){
            double mid = (right+left)/2;
            if (mid*mid > a){
                right = mid;
            }else{
                left = mid;
            }
            cnt++;
        }
        System.out.println(left);
    }
}

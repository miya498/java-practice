public class RangeSummation {
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        StringBuilder sb = new StringBuilder();
        int ans = 0;
        for (int i=a; i<b+1;i++){
            sb.append(i);
            if (i != b){
                sb.append("+");
            }else{
                sb.append("=");
            }
            ans += i;
        }
        String s = sb.toString();
        System.out.println(s + ans);
    }
}

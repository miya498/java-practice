public class Triangle {
    public static void main(String[] args){
        int cnt = Integer.parseInt(args[0]);
        StringBuilder s = new StringBuilder();
        for (int i=0; i < cnt;i++){
            s.append("*");
        }
        String ans = s.toString();
        for (int i=cnt; i > 0; i--){
            System.out.println(ans);
            ans = ans.substring(1,i);
        }
    }
}

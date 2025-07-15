public class ReverseArgs {
    public static void main(String[] args){
        int n = args.length;
        for(int i=0; i<args.length; i++){
            System.out.print(args[n-i-1] + " ");
        }
    }
}

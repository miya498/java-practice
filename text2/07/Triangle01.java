public class Triangle01 {
    public static void main(String[] args) {
        int cnt = Integer.parseInt(args[0]);
        for (int i = cnt; i > 0; i--) {
            System.out.println("*".repeat(i));
        }
    }
}

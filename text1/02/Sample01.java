public class Sample02{
    public static void main(String[] args){
        int a = 10;
        int b ;
        b = a + 20;
        System.out.println(b);
        /*エスケープシーケンス */
        System.out.println("私の好きな記号は二重引用符(\")です。");
        /*テキストブロック */
        String text = """
        名前: Bob
        年齢: 20
        身長: 175.5
        """;
        System.out.println(text);
        /*インクリメント　デクリメント演算子 */
        int c = 10;
        int d = 10;
        System.out.println(c++ + 50);
        System.out.println(++d + 50);
        
        /*命令実行文 */
        System.out.println("Hello World"); 

        int m = Math.max(10, 20);
        System.out.println(m);

        int n = Math.min(10, 20);
        System.out.println(n);

        int o = Math.abs(-10);
        System.out.println(o);

        String age = "22"; 
        int p = Integer.parseInt(age);
        System.out.println("年齢は" + p + "です。");
        
        int r = new java.util.Random().nextInt(100);
        System.out.println("ランダムな数は" + r + "です。");

        String s = new java.util.Scanner(System.in).nextLine();
        System.out.println("入力された文字列は" + s + "です。");

        int t = new java.util.Scanner(System.in).nextInt();
        System.out.println("入力された数は" + t + "です。");
    }
}
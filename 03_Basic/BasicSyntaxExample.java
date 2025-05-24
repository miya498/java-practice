public class BasicSyntaxExample {
    public static void main(String[] args) {
        // 1. printlnで出力
        System.out.println("Hello, World!");

        // 2. int型変数
        int x = 10;
        System.out.println("整数 x の値: " + x);

        // 3. double型変数
        double pi = 3.1415;
        System.out.println("円周率 pi の値: " + pi);

        // 4. boolean型変数
        boolean flag = true;
        System.out.println("フラグの値: " + flag);

        // 5. char型変数
        char c = 'A';
        System.out.println("1文字 c の値: " + c);

        // 6. String型変数
        String name = "Taro";
        System.out.println("名前: " + name);

        // 7. printとprintlnの違い
        System.out.print("これは改行しない出力 → ");
        System.out.print("続けて表示されます");
        System.out.println("（ここで改行）");

        // 8. コメントの例
        // これは1行コメントです

        /*
        これは複数行コメントです。
        説明を書きたいときに使います。
        */

        // 9. 計算式の出力
        int a = 5;
        int b = 7;
        int sum = a + b;
        System.out.println(a + " + " + b + " = " + sum);
    }
}
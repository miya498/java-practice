public class Sample01 {
    public static void main(String[] args){
        System.out.println("メソッドを呼び出します");
        hello("南魚沼");
        System.out.println("メソッドの呼び出しを終了します");
    }
    public static void hello(String name){
        System.out.println(name + "さん、こんにちは！");
        int ans = add(200,300);
        System.out.println(200+"+"+300+"="+ans);
    }

    public static int add(int a,int b){
        int ans = a+b;
        return ans;
    }
}

public class Sample01{
    public static void main(String[] args){
        boolean Weather = true;
        if(Weather){
            System.out.println("洗濯をします。");
            System.out.println("散歩に行きます。");
        }else{
            System.out.println("DVDを見ます。");
        }

        boolean doorClose = true;
        int cnt = 0;
        while (doorClose == true && cnt < 10){
            System.out.println("ノックする");
            System.out.println("1分待つ");
            cnt++;
        }
        /* 文字列の比較 */
        String s = "Hello";
        if(s.equals("Hello")){
            System.out.println("sはHelloです。");
        }
    }
}
public class practice03 {
    public static void main(String[] args){
        System.out.println("[数当てゲーム]");
        int ans = new java.util.Random().nextInt(10);
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        try {
            for (int i = 0; i < 5; i++){
                System.out.println("0~9の数字を入力してください（残り" + (5-i) + "回）");
                int num = scanner.nextInt();
                
                if (num == ans){
                    System.out.println("あたり！");
                    System.out.println("ゲームを終了します");
                    return;
                } else {
                    System.out.println("外れ！");
                    if (num < ans) {
                        System.out.println("もっと大きい数字です");
                    } else {
                        System.out.println("もっと小さい数字です");
                    }
                }
            }
            System.out.println("正解は " + ans + " でした");
            System.out.println("ゲームを終了します");
        } finally {
            scanner.close();
        }
    }
}

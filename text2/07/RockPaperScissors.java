import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("グー(R),パー(P),チョキ(S) > ");
            String input = scanner.nextLine();
            String s;
            double randomNumber = Math.random()*3;
            if (0 <= randomNumber && randomNumber < 1){
                s = "R";
                System.out.println("コンピューター:グー");
            }else if(1 <= randomNumber && randomNumber < 2){
                s = "P";
                System.out.println("コンピューター:パー");
            }else{
                s = "S";
                System.out.println("コンピューター:チョキ");
            }

            int ans = WinnerLoser(input,s);
            if (ans == 0){
                System.out.println("結果:あいこ");
            }else if(ans == 1){
                System.out.println("結果:あなたの勝ち");
                System.exit(1);
            }else{
                System.out.println("結果:コンピューターの勝ち");
                System.exit(1);
            }
        }
    }

    public static int WinnerLoser(String a,String b){
        // あいこ:0 ユーザー勝ち:1 コンピューター勝ち:2
        if (a.equals(b)){
            return 0;
        }
        if (a.equals("R")){
            if(b.equals("P")){
                return 2;
            }else{
                return 1;
            }
        }else if (a.equals("P")){
            if(b.equals("R")){
                return 1;
            }else{
                return 2;
            }
        }else{
            if(b.equals("P")){
                return 1;
            }else{
                return 2;
            }
        }
    }
}

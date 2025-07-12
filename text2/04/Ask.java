import java.util.Scanner;

public class Ask {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("ご用件は何でしょうか？>");
        String input = scanner.nextLine();
        System.out.println("ご用件は\"" + input + "\"ですね。");
    }
}

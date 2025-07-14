import java.util.Scanner;
/**
 * 内容をオウム返しをするプログラム
 */
public class Echo {
    public static void main(String[] args){
        String name = Echo.ask("名前");
        String message = ask("用件");

        System.out.println(name + "さん、こんにちは。ご用件は「" + message + "」ですね");
    }
/**
 * ユーザーに向けたプロンプトを表示した上で
 * ユーザーからのキーボード入力を受け付けます
 * @param prompt ユーザーに表示するプロンプト
 * @return キーボード入力された文字列
 */

    static String ask(String prompt){
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt + "を入力してください。:");
        String userInput = scanner.nextLine();
        return userInput;
    }
}

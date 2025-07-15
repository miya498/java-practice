import java.util.Scanner;

public class CountEnglishWords {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("入力してください > ");
        String input = scanner.nextLine();
        String[] words = input.trim().split("\\s");
        System.out.println("単語数: " + words.length);
    }
}

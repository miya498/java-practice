public class practice02 {
    public static void main(String[] args){
        int[] numbers = new int[] {3,4,9};
        System.out.println("1桁の数字を入力してください");
        int input = new java.util.Scanner(System.in).nextInt();
        for (int i=0;i<numbers.length;i++){
            if (input == numbers[i]){
                System.out.println("あたり！");
            }
        }
    }
}

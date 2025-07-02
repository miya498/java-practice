public class Main {
    public static void main(String[] args){
        BankAccount b1 = new BankAccount();
        b1.accountNumber = "4649";
        b1.balance = 1592;

        System.out.println(b1);

        BankAccount b2 = new BankAccount();
        b2.accountNumber = " 4649";
        b2.balance = 1592;
        
        if (b1.equals(b2)){
            System.out.println("口座番号は等しいです。");
        }else{
            System.out.println("口座番号が異なります。");
        }
    }
}

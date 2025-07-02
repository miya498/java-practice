public class BankAccount {
    String accountNumber;
    int balance;

    @Override
    public String toString() {
        return "￥" + balance + "(口座番号:" + accountNumber + ")";
    }

    public boolean equals(Object o){
        if (this == o){ return true;}

        if (o instanceof BankAccount b){
            if (this.accountNumber.trim().equals(b.accountNumber.trim())){
                return true;
            }
        }
        return false;
    }
}

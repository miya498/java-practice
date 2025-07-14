public class FizzBuzz {
    public static void main(String[] args){
        StringBuilder ans = new StringBuilder();
        for(int i=1;i < 101;i++){
            if(i%15 == 0){
                ans.append("FizzBuzz");
            }else if(i%3 == 0){
                ans.append("Fuzz");
            }else if(i%5 == 0){
                ans.append("Buzz");
            }else{
                ans.append(i);
            }

            if(i != 100) ans.append(",");
        }

        System.out.println(ans);
    }
}

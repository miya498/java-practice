public class Main01 {
    public static void main(String[] args){
        try{
        int i = Integer.parseInt("三");
        }catch (NumberFormatException e){
            System.out.println("数値に変換できません");
        }
    }
}

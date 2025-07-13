public class CalcBmi {
    public static void main(String[] args){
        double height = Double.parseDouble(args[0]);
        double weight = Double.parseDouble(args[1]);
        double bmi = weight/(height*height);

        System.out.printf("あなたの健康状態: 標準 (BMI=%.5f)", bmi);

    }
}

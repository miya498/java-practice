public class CalcBmi {
    public static void main(String[] args){
        double height = Double.parseDouble(args[0]);
        double weight = Double.parseDouble(args[1]);
        double bmi = weight/(height*height);
        String[] words = {"瘦せすぎ","標準","太り気味","太りすぎ"};
        if (bmi < 18.5){
            System.out.printf("あなたの健康状態: %s (BMI=%.5f)", words[0], bmi);
        }else if(bmi < 25){
            System.out.printf("あなたの健康状態: %s (BMI=%.5f)", words[1], bmi);
        }else if(bmi < 30){
            System.out.printf("あなたの健康状態: %s (BMI=%.5f)", words[2], bmi);
        }else{
            System.out.printf("あなたの健康状態: %s (BMI=%.5f)", words[3], bmi);
        }

    }
}

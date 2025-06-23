public class Sample01 {
    public static void main(String[] args){
        int[] scores = new int[5];
        int num = scores.length;
        System.out.println("要素の数は"+num);

        int[] scores1 = new int[] {20,30,40,50,80};
        int[] scores2 = {20,30,40,50,80};

        for (int i=0;i<scores1.length;i++){
            System.out.println(scores1[i]);
        }

        int sum = 0;
        for (int i=0;i<scores2.length;i++){
            sum += scores2[i];
        }

        int avg = sum/scores2.length;
        System.out.println("合計点:"+sum);
        System.out.println("平均点:"+avg);
    }
}

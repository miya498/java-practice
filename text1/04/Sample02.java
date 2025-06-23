public class Sample02 {
    public static void main(String[] args){
        int[] seq = new int[10];

        for (int i=0;i<seq.length;i++){
            seq[i] = new java.util.Random().nextInt(4);
        }
        char[] base = {'A','T','G','C'};
        for (int i=0;i<seq.length;i++){
            System.out.print(base[seq[i]]+" ");
        }
        System.out.println("");
        int[] scores = {20,30,40,50,80};
        for (int value:scores){
            System.out.println(value);
        }
    }
}
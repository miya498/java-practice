public class Main {
    public static void main(String[] args){
        Y[] C = new Y[2];
        C[0] = new A();
        C[1] = new B();

        for(Y c:C){
            c.b();
        }


    }
}

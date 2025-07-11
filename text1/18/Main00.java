import java.io.FileReader;
import java.io.FileWriter;

public class Main00 {
    public static void main(String[] args) throws Exception{
        FileReader fr = null;
        try {
            fr = new FileReader("data.txt");
            int input = fr.read();
            while (input != -1){
                System.out.print((char)input);
                input = fr.read();
            }
        } catch (Exception e) {
            System.out.println("ファイル読み込みエラーが発生しました: " + e.getMessage());
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (Exception e) {
                System.out.println("ファイルのクローズ時にエラーが発生しました: " + e.getMessage());
            }
        }

        FileWriter fw = null;
        try {
            fw = new FileWriter("data.txt");
            fw.write('そ');
            fw.write('れ');
            fw.write('で');
            fw.write('は');

        } catch (Exception e) {
            System.out.println("ファイル読み込みエラーが発生しました: " + e.getMessage());
        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (Exception e) {
                System.out.println("ファイルのクローズ時にエラーが発生しました: " + e.getMessage());
            }
        }

    }
}

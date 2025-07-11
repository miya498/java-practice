import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class Main01 {
    public static void main(String[] args) throws Exception{
        URL u = new URL("http://abehiroshi.la.coocan.jp/");

        URLConnection connection = u.openConnection();
        try (InputStream is = connection.getInputStream()) {
            int i = is.read();
            while(i != -1){
                char c = (char)i;
                System.out.print(c);
                i = is.read();
            }
        }
    }
}

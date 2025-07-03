import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Main05 {
    public static void main(String[] args) throws Exception{
        long start = System.currentTimeMillis();

        Date now = new Date();
        System.out.println(now);
        System.out.println(now.getTime());
        Date past = new Date(1694984000000L);
        System.out.println(past);

        Calendar c = Calendar.getInstance();
        c.set(2024, 6, 3, 23,54, 23);
        //Month+1が値になる
        c.set(Calendar.MONTH, 7);
        Date d = c.getTime();
        System.out.println(d);

        Date now00 = new Date();
        c.setTime(now00);
        int y = c.get(Calendar.YEAR);
        System.out.println("今年は" + y + "年です");

        SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date day = f.parse("2023/09/12 12:34:56");
        System.out.println(day);
        Date day1 = new Date();
        String s = f.format(day1);
        System.out.println("現在は" + s + "です");

        long end = System.currentTimeMillis();

        System.out.println("システムの処理にかかった時間は" + (end-start) + "ミリ秒です。");
    }
}

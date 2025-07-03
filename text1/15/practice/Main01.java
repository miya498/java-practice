import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main01 {
    public static void main(String[] args){
        Date now = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(now);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        day += 100;
        cal.set(Calendar.DAY_OF_MONTH, day);

        Date future = cal.getTime();

        SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
        String formatted = f.format(future);
        System.out.println(formatted);
    }
}

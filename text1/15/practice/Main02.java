import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main02 {
    public static void main(String[] args){
        LocalDate ldate = LocalDate.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");

        LocalDate future = ldate.plusDays(100);
        String str = future.format(format);
        System.out.println(str);

    }
}

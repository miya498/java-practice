import java.time.*;
import java.time.format.*;

public class Main07 {
    public static void main(String[] args){

        LocalDateTime l1 = LocalDateTime.now();
        LocalDateTime l2 = LocalDateTime.of(2024,11,9,5,0,0);

        ZonedDateTime z1 = l2.atZone(ZoneId.of("Europe/London"));
        LocalDateTime l3 = z1.toLocalDateTime();
        
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate ldate = LocalDate.parse("2023/09/22",fmt);

        //1000日後の計算

        LocalDate ldatep = ldate.plusDays(1000);
        String str = ldatep.format(fmt);
        System.out.println("1000日後は" + str);

        //現在の日付との比較
        LocalDate now = LocalDate.now();
        if(now.isAfter(ldatep)){
            System.out.println("本日は、その日より未来です");
        }
    
    }
}

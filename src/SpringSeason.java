import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class SpringSeason {
    public static void main (String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = simpleDateFormat.parse("2022-03-20");
        Date date2 = simpleDateFormat.parse("2022-10-21");
        boolean isBefore = date1.before(date2);
        boolean isAfter = date1.after(date2);
        System.out.println("isBefore:" + isBefore);
        System.out.println("isAfter:" + isAfter);
    }
}

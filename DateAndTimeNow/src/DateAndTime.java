import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by NguyenVanQuan on 7/20/2017.
 */
public class DateAndTime {
    public static void main (String[] args ){
        Calendar cal = Calendar.getInstance();
        Date ngaythang = cal.getTime();
        SimpleDateFormat thoigian = new SimpleDateFormat("dd/MM/yyy HH:mm:ss ");
        System.out.println(thoigian.format(ngaythang));
    }
}


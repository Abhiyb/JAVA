import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        String a = "09/06/2003";
        try {
            DateFormat o1 = new SimpleDateFormat("MM/dd/yy");
            o1.setLenient(false);  // Set to strict validation
            Date date = o1.parse(a);
            DateFormat o2 = new SimpleDateFormat("MMMM dd, yyyy");
            String outputdate = o2.format(date);
            System.out.println("Formatted date " + outputdate);
        } catch (ParseException e) {
            System.out.println("Invalid date");
        }
    }
}

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class App {


    public static void main(String[] args) {
        LocalDateTime  fakeBirthday = LocalDateTime.of(2000, 8, 11, 3, 11, 0);

        ZoneId timeZone = ZoneId.of("Europe/Paris");

        ZonedDateTime convertedBirthday = ZonedDateTime.of(fakeBirthday, timeZone);
        System.out.println(convertedBirthday);

    }

}

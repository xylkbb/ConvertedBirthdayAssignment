import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class App {


    public static void main(String[] args) {
        LocalDateTime  fakeBirthday = LocalDateTime.of(2000, 8, 11, 3, 11, 0);

        ZoneId timeZone1 = ZoneId.of("America/New_York");
        ZoneId timeZone2 = ZoneId.of("Europe/Paris");

        ZonedDateTime convertedBirthday = ZonedDateTime.of(fakeBirthday, timeZone1);
        ZonedDateTime birthdayEurope = convertedBirthday.withZoneSameInstant(timeZone2);

        System.out.println(convertedBirthday);
        System.out.println(birthdayEurope);


    }

}

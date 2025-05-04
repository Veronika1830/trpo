import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class trpo {
    public static void main(String[] args) {
       String lastName = "Tatuzha";
        String firstName = "Veronika";
        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = currentTime.format(formatter);
        System.out.println("lastName: " + lastName + ", firstName: " + firstName + ", Time: " + formattedTime);
    }
}

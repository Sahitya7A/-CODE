import java.time.*;

public class date2 {
  public static void main(String[] args) {
    LocalTime time1 = LocalTime.of(2, 15); // hour and minute
    LocalTime time2 = LocalTime.of(6, 15, 30); // + seconds
    LocalTime time3 = LocalTime.of(6, 15, 30, 200); // + nanoseconds
    System.out.println(time1);
    System.out.println(time2);
    System.out.println(time3);

    LocalDateTime dateTime1 = LocalDateTime.of(2021, Month.JANUARY, 32, 6, 15, 30);
    System.out.println(dateTime1);

   /* LocalDate d = new LocalDate(); 
    System.out.println(d);

    System.out.println(LocalDate.of(2020, Month.JANUARY, 32));*/
  }
}
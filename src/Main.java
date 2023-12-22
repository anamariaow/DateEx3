import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        //Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        System.out.println(data);
        //ottieni l'anno (due modi)
        String getYear = String.valueOf(data.getYear());
        String anno = data.format(DateTimeFormatter.ofPattern("yyyy"));
        //ottieni il mese
        String getMonth = String.valueOf(data.getMonth());
        //ottieni il giorno
        String getDay = String.valueOf(data.getDayOfMonth());
        //ottieni il giorno della settimana
        String getWeekDay = String.valueOf(data.getDayOfWeek());
        //Stampa i risultati sulla console
        System.out.println("Anno: " + getYear);
        System.out.println("Anno yyyy: " + anno);
        System.out.println("Mese: " + getMonth);
        System.out.println("Giorno: " + getDay);
        System.out.println("Giorno della settimana: " + getWeekDay);
    }
}

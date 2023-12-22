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
        String mese = data.format(DateTimeFormatter.ofPattern("MMMM"));
        //ottieni il giorno
        String getDay = String.valueOf(data.getDayOfMonth());
        String giorno = data.format(DateTimeFormatter.ofPattern("dd"));
        //ottieni il giorno della settimana
        String getWeekDay = String.valueOf(data.getDayOfWeek());
        String giornoSettimana = data.format(DateTimeFormatter.ofPattern("EEEE"));
        //Stampa i risultati sulla console
        System.out.println("Anno: " + getYear);
        System.out.println("Anno yyyy: " + anno);
        System.out.println("Mese: " + getMonth);
        System.out.println("Mese MMMM: " + mese);
        System.out.println("Giorno: " + getDay);
        System.out.println("Giorno dd: " + giorno);
        System.out.println("Giorno della settimana: " + getWeekDay);
        System.out.println("Giorno della settimana EEEE: " + giornoSettimana);
    }
}

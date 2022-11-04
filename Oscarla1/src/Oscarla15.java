import java.util.Scanner;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Oscarla15 {

	public static void funcion(int[] n) {
        int aprobados = 0;
        double notaMedia = 0;
        long notaMediaRedondeada = 0;
        for(int i=0; i < n.length; i++) {
            notaMedia += n[i];
            if (n[i]>=5)
                aprobados++;
        }
        notaMedia = notaMedia/4;
        notaMediaRedondeada = Math.round(notaMedia);
        System.out.println("Nota media = " + notaMedia + "\n" 
                            + "Nota media redondeada = " + notaMediaRedondeada + "\n"
                            + "Num de aprobados = " + aprobados + "\n"
                            + "Num de suspenso = " + (4-aprobados) + "\n");
    }
}
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class Program {

    public static void main(String[] args) {

        System.out.println("INSTANCIACAO");
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2023-03-08");
        LocalDateTime d05 = LocalDateTime.parse("2023-03-08T19:50:28");
        Instant d06 = Instant.parse("2023-03-08T19:50:28Z");
        Instant d07 = Instant.parse("2023-03-08T19:50:28-03:00");

        LocalDate d08 = LocalDate.parse("20/07/2022", DateTimeFormatter.ofPattern("dd/MM/yyy"));

        DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm");
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt01);

        LocalDate d10 = LocalDate.of(2022,7,20);
        LocalDateTime d11 = LocalDateTime.of(2022,7,20,19,58);

        System.out.println("d01: " + d01);
        System.out.println("d02: " + d02);
        System.out.println("d03: " + d03);
        System.out.println("d04: " + d04);
        System.out.println("d05: " + d05);
        System.out.println("d06: " + d06);
        System.out.println("d07: " + d07);
        System.out.println("d08: " + d08);
        System.out.println("d09: " + d09);
        System.out.println("d10: " + d10);
        System.out.println("d11: " + d11);

        System.out.println("---------------------------");
        System.out.println("FORMATACAO");

        LocalDate d12 = LocalDate.parse("2023-03-08");
        LocalDateTime d13 = LocalDateTime.parse("2023-03-08T20:02:27");
        Instant d14 = Instant.parse("2023-03-08T20:02:27Z");

        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        System.out.println("d12: " + d12);
        System.out.println("d13: " + d12.format(fmt2));
        System.out.println("d14: " + fmt3.format(d13));

        System.out.println("d14: " + fmt4.format(d14));

        System.out.println("---------------------------");
        System.out.println("CONVERCAO - GLOBAL > LOCAL");

        LocalDate data = LocalDate.parse("2023-03-19");
        LocalDateTime dataTempo = LocalDateTime.parse("2023-03-19T02:30");
        Instant dataGlobal = Instant.parse("2023-03-19T02:30:00Z");

        LocalDate r1 = LocalDate.ofInstant(dataGlobal, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(dataGlobal, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(dataGlobal, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(dataGlobal, ZoneId.of("Portugal"));

        System.out.println("data = " + data);
        System.out.println("dataTempo = " + dataTempo);
        System.out.println("dataGlobal = " + dataGlobal);

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);
        System.out.println("data dia = " + data.getDayOfMonth());
        System.out.println("data mes = " + data.getMonthValue());
        System.out.println("data ano = " + data.getYear());
        System.out.println("dataTempo ano = " + dataTempo.getHour());
        System.out.println("dataTempo ano = " + dataTempo.getMinute());

        System.out.println("---------------------------");
        System.out.println("CALCULOS DATA HORA");

        System.out.println("data = " + data);
        System.out.println("dataTempo = " + dataTempo);
        System.out.println("dataGlobal = " + dataGlobal);

        LocalDate semanaPassada = data.minusDays(7);
        LocalDate semanaProxima = data.plusDays(7);

        System.out.println("Semana Passada = " + semanaPassada);
        System.out.println("Semana Proxima = " + semanaProxima);

        LocalDateTime semPassadaTempo = dataTempo.minus(7, ChronoUnit.DAYS);
        LocalDateTime semPassadaTempo2 = dataTempo.minusDays(7);
        LocalDateTime semProximaTempo = dataTempo.plusDays(7);

        System.out.println("Sem Passada Tempo = " + semPassadaTempo);
        System.out.println("Sem Passada2 Tempo = " + semPassadaTempo2);
        System.out.println("Sem Proxima Tempo = " + semProximaTempo);

        Instant semPassGlobal = dataGlobal.minus(7, ChronoUnit.DAYS);
        Instant semProxGlobal = dataGlobal.plus(7, ChronoUnit.DAYS);

        System.out.println("Sem Passada Global = " + semPassGlobal);
        System.out.println("Sem Proxima Global = " + semProxGlobal);
        System.out.println("Sem Proxima Global = " + semProxGlobal.atZone(ZoneId.systemDefault()));

        Duration t1 = Duration.between(data.atTime(0,0), semanaProxima.atStartOfDay());
        Duration t2 = Duration.between(dataTempo, semPassadaTempo);
        Duration t3 = Duration.between(dataGlobal.minus(1, ChronoUnit.HALF_DAYS), dataGlobal);

        System.out.println("Duracao dias = " + t1.toDays());
        System.out.println("Duracao dias = " + t2.toDays());
        System.out.println("Duracao horas = " + t3.toHours());


    }
}

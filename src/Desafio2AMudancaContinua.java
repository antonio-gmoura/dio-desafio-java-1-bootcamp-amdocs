import java.io.IOException;
import java.util.Scanner;

public class Desafio2AMudancaContinua {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        final int horaEmSegundos = 60 * 60;
        final int diaEmGraus = 360;
        final int diaEmSegundos = 24 * horaEmSegundos;
        int grausEmSegundos;
        int minutosEmSegundos;
        int horas;
        int minutos;
        int segundos;
        while (leitor.hasNext()) {
            double graus = leitor.nextDouble();
            if (graus <= 360) {
                //cálculos
                grausEmSegundos = (int) (graus / diaEmGraus * diaEmSegundos);
                horas = grausEmSegundos / horaEmSegundos;
                minutosEmSegundos = grausEmSegundos % horaEmSegundos;
                minutos = minutosEmSegundos / 60;
                segundos = minutosEmSegundos % 60;
                if (horas >= 18) horas -= 18;
                else horas += 6;
                //mensagens
                if (graus == 360 || graus < 90) System.out.println("Bom Dia!!");
                else if (graus >= 270) System.out.println("De Madrugada!!");
                else if (graus >= 180) System.out.println("Boa Noite!!");
                else if (graus >= 90) System.out.println("Boa Tarde!!");
                System.out.printf("%02d:%02d:%02d%n", horas, minutos, segundos);
            }
        }
    }
}

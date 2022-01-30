import java.io.IOException;
import java.util.Scanner;

public class Desafio1AMudanca {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        while (leitor.hasNext()) {
            int graus = leitor.nextInt();
            if (graus == 360 || graus < 90) System.out.println("Bom Dia!!");
            else if (graus >= 270) System.out.println("De Madrugada!!");
            else if (graus >= 180) System.out.println("Boa Noite!!");
            else if (graus >= 90) System.out.println("Boa Tarde!!");
        }
    }
}

import java.io.IOException;
import java.util.Scanner;

public class Desafio3Colchao {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int A = leitor.nextInt();
        int B = leitor.nextInt();
        int C = leitor.nextInt();
        int H = leitor.nextInt();
        int L = leitor.nextInt();

        //Complete o problema com o seu código .
        if ((B > H && C > H) || (A > L)) {
            System.out.println('N');
        }
        else {
            System.out.println('S');
        }
    }
}

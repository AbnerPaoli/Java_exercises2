// Nome: Abner Juan de Paiva Olivira
// Matrícula: 1261946673
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        

        int Numero;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        Numero = scanner.nextInt();

        if (Numero % 2 == 0) {
            System.out.println("O número é par. ");
        } else {
            System.out.println("o número é ímpar. ");
        }
        
    scanner.close();
        }

}

// Nome: Abner Juan de Paiva Olivira
// Matrícula: 1261946673
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
            
       int Numero;
       int Multiplicador =1;
       
       Scanner scanner = new Scanner(System.in);

       System.out.println("Digite um número: ");
       Numero = scanner.nextInt();

       while (Multiplicador <= 10) {
        System.out.println(Numero + " x " + Multiplicador + " = " + (Numero * Multiplicador));
        Multiplicador++;
       }

         scanner.close();
    }
}

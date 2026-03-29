// Nome: Abner Juan de Paiva Olivira
// Matrícula: 1261946673
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int NumeroSecreto=42;
        int Tentativa =1;
        int Chute;
        boolean Acertou = false;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número secreto(1 a 100): ");
        
        while(Tentativa <=5) {
            System.out.println("Tentativa " + Tentativa + ": ");
            Chute = scanner.nextInt();

            if(Chute == NumeroSecreto) {
                System.out.println("Parabéns! Você acertou o número secreto.");
                Acertou = true;
                break;
            } else if (Chute < NumeroSecreto) {
                System.out.println("O número secreto é maior.");
            } else {
                System.out.println("O número secreto é menor.");
            }
            Tentativa++;

            if(Acertou) {
                System.out.println("Você não acertou. O número secreto era: " + NumeroSecreto+".");
            }

            scanner.close();


        }

    }
}

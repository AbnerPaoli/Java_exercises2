// Nome: Abner Juan de Paiva Olivira
// Matrícula: 1261946673
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int numero;
        int Contador = 1;

        Scanner scanner =new Scanner(System.in);

        System.out.println("Digite um número:");
        numero = scanner.nextInt();

       if(numero <=0){
        System.out.println("Valor inválido. O número deve ser maior qur zero. ");
        } else {
            while(Contador<=numero){
                System.out.println(Contador);
                Contador++;
        
       }
       System.out.println("Contagem concluída.");
    }
    scanner.close();

    }
}

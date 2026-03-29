// Nome: Abner Juan de Paiva Olivira
// Matrícula: 1261946673
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        double Nota;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota(0 a 100)");
        Nota = scanner.nextDouble();

        while(Nota < 0 || Nota > 100){
            System.out.println("Valor inválido. Digite uma nota entre 0 e 100.");
            Nota = scanner.nextDouble();
        }

        if(Nota >= 90){
            System.out.println("Conceito A");
        } else if (Nota >= 80) {
            System.out.println("Conceito B");
        } else if (Nota >= 70) {
            System.out.println("Conceito C");
        } else if (Nota >= 60) {
            System.out.println("Conceito D (Reprovado)");
        } 

        scanner.close();
    }
}

// Nome: Abner Juan de Paiva Olivira
// Matrícula: 1261946673
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        

        int lado1;
        int lado2;
        int lado3;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do lado 1: ");
        lado1 = scanner.nextInt();

        System.out.println("Digite o valor do lado 2: ");
        lado2 = scanner.nextInt();

        System.out.println("Digite o valor do lado 3: ");
        lado3 = scanner.nextInt();

        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("O triângulo é equilátero.");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("O triângulo é isósceles.");
        } else {
            System.out.println("O triângulo é escaleno.");
        }

        scanner.close();
 }
}

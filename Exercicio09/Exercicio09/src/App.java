// Nome: Abner Juan de Paiva Olivira
// Matrícula: 1261946673
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int Opcao = -1; 
        double Valor;
        double Resultado;
        
        
        Scanner scanner = new Scanner(System.in);

        while (Opcao != 0) {

            System.out.println("\n=== CONVERSOR DE UNIDADES ===");
            System.out.println("1 - Quilômetros para Milhas");
            System.out.println("2 - Celsius para Fahrenheit");
            System.out.println("3 - Quilogramas para Libras");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            Opcao = scanner.nextInt();

            switch (Opcao) {

                case 1:
                    System.out.print("Digite a distância em km: ");
                    Valor = scanner.nextDouble();
                    Resultado = Valor * 0.621371;
                    System.out.println(Valor + " km = " + Resultado + " milhas");
                    break;

                case 2:
                    System.out.print("Digite a temperatura em Celsius: ");
                    Valor = scanner.nextDouble();
                    Resultado = (Valor * 9 / 5) + 32;
                    System.out.println(Valor + "°C = " + Resultado + "°F");
                    break;

                case 3:
                    System.out.print("Digite o peso em kg: ");
                    Valor = scanner.nextDouble();
                    Resultado = Valor * 2.20462;
                    System.out.println(Valor + " kg = " + Resultado + " libras");
                    break;

                case 0:
                    System.out.println("Encerrando. Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
        
    }
}

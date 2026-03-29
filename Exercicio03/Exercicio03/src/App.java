// Nome: Abner Juan de Paiva Olivira
// Matrícula: 1261946673
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        double Numero1;
        double Numero2;
        double Resultado;
        int Opcao;

        Scanner scanner = new Scanner(System.in);


        System.out.println("digite o valor do número 1:");
        Numero1 = scanner.nextDouble();

        System.out.println("digite o valor do número 2: ");
        Numero2 = scanner.nextDouble();
       
        System.out.println("Operações: 1 - Soma, 2 - Subtração, 3 - Multiplicação, 4 - Divisão");
        System.out.print("Digite a opção desejada: ");
        Opcao = scanner.nextInt();

        switch(Opcao) {
            case 1:
            Resultado = Numero1 + Numero2;
            System.out.println("O resultado da soma é: "+ Resultado);
            break;

            case 2:
            Resultado = Numero1 - Numero2;
            System.out.println("O resultado da subtração é: "+ Resultado);
            break;

            case 3:
            Resultado = Numero1 * Numero2;
            System.out.println("O resultado da multiplicação é: "+ Resultado);
            break;
            case 4:
           if (Numero2!=0){
            Resultado = Numero1 / Numero2;
            System.out.println("O resultado da divisão é: "+ Resultado);
            break;
              } else { 
                System.out.println("Não é possível dividir por zero.");
              }
              break;

              default:
                System.out.println("Opção inválida. Por favor, escolha uma opção entre 1 e 4.");
            }

    scanner.close();

    }
}

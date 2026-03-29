import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
               
        double Saldo = 1000.00;
        int Opcao = -1;
        double Valor;

        Scanner scanner = new Scanner(System.in);

        while (Opcao != 0) {

            System.out.println("\n=== CAIXA ELETRÔNICO ===");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar saldo");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            Opcao = scanner.nextInt();

            switch (Opcao) {

                case 1:
                    System.out.print("Valor do depósito: R$ ");
                    Valor = scanner.nextDouble();

                    if (Valor > 0) {
                        Saldo += Valor;
                        System.out.printf("Depósito realizado. Novo saldo: R$ %.2f%n", Saldo);
                    } else {
                        System.out.println("Erro: valor inválido.");
                    }
                    break;

                case 2:
                    System.out.print("Valor do saque: R$ ");
                    Valor = scanner.nextDouble();

                    if (Valor <= 0) {
                        System.out.println("Erro: valor inválido.");
                    } else if (Valor > Saldo) {
                        System.out.printf("Saldo insuficiente. Saldo disponível: R$ %.2f%n", Saldo);
                    } else {
                        Saldo -= Valor;
                        System.out.printf("Saque realizado. Novo saldo: R$ %.2f%n", Saldo);
                    }
                    break;

                case 3:
                    System.out.printf("Saldo atual: R$ %.2f%n", Saldo);
                    break;

                case 0:
                    System.out.println("Obrigado. Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();

    }
}

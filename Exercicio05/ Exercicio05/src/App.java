// Nome: Abner Juan de Paiva Olivira
// Matrícula: 1261946673
import  java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int Numero = 1;
        int Soma = 0;

        Scanner Scanner = new Scanner(System.in);

        while (Numero != 0) {
            System.out.println("Digite um número (ou 0 para sair):");
            Numero = Scanner.nextInt();
            Soma += Numero;
        }
        System.out.println("A soma dos números digitados é: " + Soma);

        Scanner.close();

    }
}

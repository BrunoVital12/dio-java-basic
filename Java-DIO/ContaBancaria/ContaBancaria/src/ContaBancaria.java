import java.util.Locale;
import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        
        System.out.println("----------------------------");
        System.out.println("Insira o seu nome: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Insira o numero da sua agencia: ");
        agencia = scanner.nextLine();

        System.out.println("Insira o numero da sua conta: ");
        numero = scanner.nextInt();

        System.out.println("Insira o seu saldo: ");
        saldo = scanner.nextDouble();

        System.out.println("----------------------------");
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.\nAgencia: " + agencia + "\nConta: " + numero + "\nSaldo disponível para saque: " + saldo);
        System.out.println("----------------------------");
        scanner.close();
    }
}

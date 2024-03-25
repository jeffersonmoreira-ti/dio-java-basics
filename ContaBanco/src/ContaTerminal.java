import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        /*
         * Numero Inteiro 1021
         * Agencia Texto 067-8
         * Nome Cliente Texto MARIO ANDRADE
         * Saldo Decimal 237.48
         * 
         */
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double saldo = 0;
        int numeroConta;
        String agencia;
        String nomeCliente = "";

        System.out.println("Por favor, digite o número da Agência:");
        agencia = scanner.next();

        System.out.println("Por favor, digite o número da conta:");
        numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o nome do cliente:");
        Scanner lineScanner = new Scanner(System.in);
        nomeCliente = lineScanner.nextLine();        
        
        System.out.println("Por favor, digite o saldo:");
        saldo = scanner.nextDouble();

        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
                nomeCliente, agencia, numeroConta, saldo);

    }
}

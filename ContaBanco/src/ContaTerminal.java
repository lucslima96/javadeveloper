import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o numero da conta: ");
        int numeroConta = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Por favor, digite o numero da agência: ");
        int agencia = scanner.nextInt();

        System.out.println("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo inicial: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo R$" + saldo + " já esta disponível para saque!");

    }
    
}

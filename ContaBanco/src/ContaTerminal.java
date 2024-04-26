import java.util.*;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.print("Por favor, digite o numero da sua conta: ");
        numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Por favor, digite o numero da sua agencia: ");
        agencia = scanner.nextLine();

        System.out.print("Por favor, digite seu nome: ");
        nomeCliente = scanner.nextLine();

        System.out.print("Por favor digite seu saldo: ");
        saldo = scanner.nextDouble();

        System.out.println("Olá "+ nomeCliente +" obrigado por criar uma conta em nosso banco, "+ 
        "sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}

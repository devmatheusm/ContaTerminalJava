import java.util.Scanner;

public class ContaTerminal {
    /**
     * 
     * @author Matheus Morais
     * @since 12/07/2024
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int numeroDaConta;
        String numeroDaAgencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o número da Agência ! exemplo: 067-8\nAgencia: ");
        numeroDaAgencia = scanner.next();
        scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta ! exemplo: 1021\nConta: ");
        numeroDaConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o seu Nome ! exemplo: John Doe\nNome Completo: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o valor do deposito inicial ! exemplo: 539.32\nR$ ");
        saldo = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque!", nomeCliente, numeroDaAgencia, numeroDaConta, saldo);
        
        scanner.close();
    }
}

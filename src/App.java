import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta !");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o numero da agência !");
        String agencia = scanner.next();

        System.out.println("Digite o nome do cliente !");
        String nomeCliente =  scanner.next();

        System.out.println("Digite o saldo da conta !");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                 agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já esta disponível para saque.");

        scanner.close();
    }
}

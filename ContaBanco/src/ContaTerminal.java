import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TODO: Conhecer e importar a classe scanner
        Scanner scanner = new Scanner(System.in); 

        // Exibir a mensagem para o nosso usuario
        System.out.println("Qual o seu nome?");
        String nomeCliente = scanner.nextLine();
        System.out.println("Qual o número da sua agência?");
        String agencia = scanner.nextLine();
        System.out.println("Qual o número da sua conta?");
        Integer numero = scanner.nextInt();
        System.out.println("Qual o seu saldo?");
        Double saldo = scanner.nextDouble();

        // Imprimir as informações
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}

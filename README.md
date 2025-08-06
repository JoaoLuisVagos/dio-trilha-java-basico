💻 Projeto: Coletor de Dados Bancários em Java

Este é um projeto simples feito em Java que solicita ao usuário informações bancárias básicas via terminal e imprime uma mensagem de confirmação com os dados recebidos.

✨ Funcionalidades

Coleta os seguintes dados do usuário:

Nome

Número da agência

Número da conta

Saldo

Exibe uma mensagem de boas-vindas com os dados formatados

🧰 Tecnologias utilizadas

Java (versão 8 ou superior)

Terminal/Console para entrada e saída de dados

📦 Código-fonte principal

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o seu nome?");
        String nomeCliente = scanner.nextLine();

        System.out.println("Qual o número da sua agência?");
        String agencia = scanner.nextLine();

        System.out.println("Qual o número da sua conta?");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Qual o seu saldo?");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco!");
        System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo é R$ " + saldo);

        scanner.close();
    }
}

▶️ Como executar

Verifique se o Java está instalado:

java -version

Compile o código:

javac Main.java

Execute o programa:

java Main

📄 Licença

Este projeto é livre para uso educacional e pessoal.

package dio.basic;

import java.util.Scanner;

public class BancoTerminal {

    public static void main(String[] args) {
        new BancoTerminal().executar();
    }

    /**
     * Método principal que gerencia o fluxo de execução do programa. Ele solicita
     * os dados da conta bancária ao usuário, coleta as entradas e exibe as
     * informações da conta ao final.
     */
    public void executar() {

        Scanner scanner = new Scanner(System.in);

        int numeroConta = obterNumeroConta(scanner);
        String agencia = obterAgencia(scanner);
        String nomeCliente = obterNomeCliente(scanner);
        double saldo = obterSaldo(scanner);

        exibirInformacoes(numeroConta, agencia, nomeCliente, saldo);

        scanner.close();
    }

    /**
     * Solicita e retorna o número da conta fornecido pelo usuário.
     *
     * @param scanner Scanner para capturar a entrada do usuário.
     * @return O número da conta como um inteiro.
     */
    private int obterNumeroConta(Scanner scanner) {
        System.out.println("Digite o número da conta (inteiro): ");
        return scanner.nextInt();
    }

    /**
     * Solicita e retorna o código da agência fornecido pelo usuário.
     *
     * @param scanner Scanner para capturar a entrada do usuário.
     * @return A agência como uma string.
     */
    private String obterAgencia(Scanner scanner) {
        System.out.println("Digite a agência (String): ");
        scanner.nextLine();
        return scanner.nextLine();
    }

    /**
     * Solicita e retorna o nome do cliente fornecido pelo usuário.
     *
     * @param scanner Scanner para capturar a entrada do usuário.
     * @return O nome do cliente como uma string.
     */
    private String obterNomeCliente(Scanner scanner) {
        System.out.println("Digite o nome do cliente: ");
        return scanner.nextLine();
    }

    /**
     * Solicita e retorna o saldo da conta fornecido pelo usuário.
     *
     * @param scanner Scanner para capturar a entrada do usuário.
     * @return O saldo da conta como um valor double.
     */
    private double obterSaldo(Scanner scanner) {
        System.out.println("Digite o saldo da conta (double): ");
        return scanner.nextDouble();
    }

    /**
     * Exibe as informações completas da conta bancária fornecidas pelo usuário.
     *
     * @param numeroConta O número da conta bancária.
     * @param agencia O código da agência bancária.
     * @param nomeCliente O nome do cliente.
     * @param saldo O saldo da conta.
     */
    private void exibirInformacoes(int numeroConta, String agencia, String nomeCliente, double saldo) {
        System.out.println("\nInformações da conta:");
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Agência: " + agencia);
        System.out.println("Nome do Cliente: " + nomeCliente);
        System.out.println("Saldo: " + saldo);
    }
}
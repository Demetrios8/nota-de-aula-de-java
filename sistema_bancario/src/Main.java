import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaBancaria contaPrincipal = new ContaBancaria("12345-6", "Cliente Principal");
        ContaBancaria contaDestino = new ContaBancaria("98765-4", "Cliente Destino");

        int opcao = 0;

        while (opcao != 5) {
            exibirMenu();
            try {
                System.out.print("Escolha uma opção: ");
                opcao = sc.nextInt();

                switch (opcao) {
                    case 1:
                        consultarSaldo(contaPrincipal);
                        break;
                    case 2:
                        realizarDeposito(sc, contaPrincipal);
                        break;
                    case 3:
                        realizarSaque(sc, contaPrincipal);
                        break;
                    case 4:
                        realizarTransferencia(sc, contaPrincipal, contaDestino);
                        break;
                    case 5:
                        System.out.println("Encerrando o sistema. Obrigado!");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: Por favor, insira um número válido para a opção.");
                sc.next();
                opcao = 0;
            }
            System.out.println();
        }

        sc.close();
    }

    private static void exibirMenu() {
        System.out.println("--- Sistema Bancário Simples ---");
        System.out.println("1. Consultar saldo");
        System.out.println("2. Depositar");
        System.out.println("3. Sacar");
        System.out.println("4. Transferir");
        System.out.println("5. Sair");
        System.out.println("--------------------------------");
    }

    private static void consultarSaldo(ContaBancaria conta) {
        System.out.println("Saldo atual: R$ " + String.format("%.2f", conta.consultarSaldo()));
    }

    private static void realizarDeposito(Scanner scanner, ContaBancaria conta) {
        try {
            System.out.print("Digite o valor para depositar: ");
            double valor = scanner.nextDouble();
            conta.depositar(valor);
        } catch (InputMismatchException e) {
            System.out.println("Erro: Valor inválido. Use a vírgula para casas decimais.");
            scanner.next();
        }
    }

    private static void realizarSaque(Scanner scanner, ContaBancaria conta) {
        try {
            System.out.print("Digite o valor para sacar: ");
            double valor = scanner.nextDouble();
            conta.sacar(valor);
        } catch (InputMismatchException e) {
            System.out.println("Erro: Valor inválido. Use a vírgula para casas decimais.");
            scanner.next();
        }
    }

    private static void realizarTransferencia(Scanner scanner, ContaBancaria origem, ContaBancaria destino) {
        System.out.println("Você está transferindo para: " + destino.getTitular() + " (Conta: " + destino.getNumeroConta() + ")");
        try {
            System.out.print("Digite o valor para transferir: ");
            double valor = scanner.nextDouble();
            origem.transferir(destino, valor);
        } catch (InputMismatchException e) {
            System.out.println("Erro: Valor inválido. Use a vírgula para casas decimais.");
            scanner.next();
        }
    }
}
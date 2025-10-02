import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Filme filme = null;
        int opcao;

        do {
            System.out.println("\n--- Catálogo de Streaming ---");
            System.out.println("1. Cadastrar um título");
            System.out.println("2. Exibir os detalhes do título");
            System.out.println("3. Avaliar o título");
            System.out.println("4. Exibir média das avaliações");
            System.out.println("5. Encerrar o programa");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do título: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o gênero: ");
                    String genero = scanner.nextLine();
                    System.out.print("Digite o ano de lançamento: ");
                    int ano = scanner.nextInt();
                    System.out.print("Digite a duração em minutos: ");
                    int duracao = scanner.nextInt();
                    scanner.nextLine();

                    filme = new Filme(nome, genero, ano, duracao);
                    System.out.println("Título cadastrado com sucesso!");
                    break;
                case 2:
                    if (filme != null) {
                        filme.exibirDetalhes();
                    } else {
                        System.out.println("Nenhum título cadastrado ainda.");
                    }
                    break;
                case 3:
                    if (filme != null) {
                        System.out.print("Digite sua avaliação (0 a 10): ");
                        int nota = scanner.nextInt();
                        filme.avaliar(nota);
                        System.out.println("Avaliação registrada!");
                    } else {
                        System.out.println("Nenhum título cadastrado para avaliar.");
                    }
                    break;
                case 4:
                    if (filme != null) {
                        System.out.printf("Média das avaliações: %.2f\n", filme.calcularMediaAvaliacoes());
                    } else {
                        System.out.println("Nenhum título cadastrado para calcular a média.");
                    }
                    break;
                case 5:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);

        scanner.close();
    }
}
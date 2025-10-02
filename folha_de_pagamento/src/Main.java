import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Cadastro da Folha de Pagamento ---");

        System.out.print("Digite a matrícula do funcionário: ");
        int matricula = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o salário bruto do funcionário: ");
        double salarioBruto = scanner.nextDouble();

        Funcionario funcionario1 = new Funcionario();


        funcionario1.setMatricula(matricula);
        funcionario1.setNome(nome);
        funcionario1.setSalarioBruto(salarioBruto);

        System.out.println("\nCalculando folha de pagamento...\n");

        funcionario1.exibirContracheque();

        scanner.close();
    }
}
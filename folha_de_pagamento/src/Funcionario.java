
public class Funcionario {

    private int matricula;
    private String nome;
    private double salarioBruto;


    public Funcionario() {
    }

    public Funcionario(int matricula, String nome, double salarioBruto) {
        this.matricula = matricula;
        this.nome = nome;
        this.salarioBruto = salarioBruto;
    }


    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }


    public double calcularInss() {
        return getSalarioBruto() * 0.15;
    }


    public double calcularSalarioLiquido() {
        return getSalarioBruto() - calcularInss();
    }


    public void exibirContracheque() {
        System.out.println("======================================");
        System.out.println("        CONTRACHEQUE MENSAL           ");
        System.out.println("======================================");
        System.out.println("Matrícula: " + getMatricula());
        System.out.println("Nome: " + getNome());
        System.out.println("--------------------------------------");
        System.out.printf("Salário Bruto: R$ %.2f%n", getSalarioBruto());
        System.out.printf("Desconto INSS (15%%): R$ %.2f%n", this.calcularInss());
        System.out.println("--------------------------------------");
        System.out.printf("Salário Líquido: R$ %.2f%n", this.calcularSalarioLiquido());
        System.out.println("======================================");
    }
}
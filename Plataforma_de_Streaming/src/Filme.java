public class Filme {
    String nome;
    String genero;
    int ano;
    int duracao;
    double somaNotas;
    int qtdAvaliacoes;

    public Filme(String nome, String genero, int ano, int duracao) {
        this.nome = nome;
        this.genero = genero;
        this.ano = ano;
        this.duracao = duracao;
        this.somaNotas = 0;
        this.qtdAvaliacoes = 0;
    }

    void exibirDetalhes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Gênero: " + this.genero);
        System.out.println("Ano de Lançamento: " + this.ano);
        System.out.println("Duração: " + this.duracao + " minutos");
    }

    void avaliar(int nota) {
        if (nota >= 0 && nota <= 10) {
            this.somaNotas += nota;
            this.qtdAvaliacoes++;
        }
    }

    double calcularMediaAvaliacoes() {
        if (this.qtdAvaliacoes == 0) {
            return 0;
        }
        return this.somaNotas / this.qtdAvaliacoes;
    }
}

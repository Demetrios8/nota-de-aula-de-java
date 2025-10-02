public class Cirurgiao extends Medico {

    private String especialidadeCirurgica;

    public Cirurgiao(String nome, String crm, String especialidadeCirurgica) {
        super(nome, crm);
        this.especialidadeCirurgica = especialidadeCirurgica;
    }

    @Override
    public String examinarPaciente() {
        return "Realizando avaliação pré-operatória.";
    }

    public String realizarCirurgia() {
        return "Realizando cirurgia de " + this.especialidadeCirurgica + ".";
    }

    @Override
    public String toString() {
        return "Cirurgiao{" +
                "especialidadeCirurgica='" + especialidadeCirurgica + '\'' +
                ", nome='" + nome + '\'' +
                ", crm='" + crm + '\'' +
                '}';
    }
}
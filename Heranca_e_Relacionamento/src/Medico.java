public abstract class Medico {
    protected String nome;
    protected String crm;

    public Medico(String nome, String crm) {
        this.nome = nome;
        this.crm = crm;
    }

    public abstract String examinarPaciente();

    public String getNome() {
        return nome;
    }

    public String getCrm() {
        return crm;
    }

    @Override
    public String toString() {
        return "Médico: " + nome + " (" + crm + ")";
    }
}

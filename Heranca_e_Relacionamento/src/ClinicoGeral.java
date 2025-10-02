public class ClinicoGeral extends Medico {

    public ClinicoGeral(String nome, String crm) {
        super(nome, crm);
    }

    @Override
    public String examinarPaciente() {
        return "Realizando exame clínico geral.";
    }

    public String prescreverTratamentoGeral() {
        return "Prescrevendo tratamento para condições comuns.";
    }

    @Override
    public String toString() {
        return "Clínico Geral: " + nome + " (" + crm + ")";
    }
}
public class ContaBancaria {
    private String numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria(String numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0.0;
    }

    public double consultarSaldo() {
        return this.saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$ " + String.format("%.2f", valor) + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public boolean sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque inválido.");
            return false;
        }
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + String.format("%.2f", valor) + " realizado com sucesso.");
            return true;
        } else {
            System.out.println("Saldo insuficiente para saque.");
            return false;
        }
    }

    public boolean transferir(ContaBancaria destino, double valor) {
        if (valor <= 0) {
            System.out.println("Valor de transferência inválido.");
            return false;
        }
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.depositar(valor);
            System.out.println("Transferência de R$ " + String.format("%.2f", valor) + " para " + destino.getTitular() + " realizada com sucesso.");
            return true;
        } else {
            System.out.println("Saldo insuficiente para transferência.");
            return false;
        }
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }
}

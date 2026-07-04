public class ContaBancaria {

    private long numero_conta;
    private String titular;
    private String cpf;
    private double saldo;

    private static long gerarNumero;

    public ContaBancaria(String titular, String cpf) {
        gerarNumero++; //gera um número para a conta automaticamente
        this.numero_conta = gerarNumero;
        setCpf(cpf);
        setTitular(titular);
    }

    public ContaBancaria(String titular, String cpf, double saldo) {
        gerarNumero++; //gera um número para a conta automaticamente
        this.numero_conta = gerarNumero;
        setCpf(cpf);
        setTitular(titular);
        depositar(saldo);
    }

    public long getNumero_conta() {
        return numero_conta;
    }

    public String getTitular() {
        return titular;
    }

    private void setTitular(String titular) {
        if (titular.length() > 2)
            this.titular = titular;
    }

    public String getCpf() {
        return cpf;
    }

    private void setCpf(String cpf) {
        if (cpf.length() == 11) //o cpf é constituido de 11 números
            this.cpf = cpf;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0.0) {
            this.saldo += saldo;
        }
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        }
    }

    @Override
    public String toString() {
        return  "Número das conta: " + getNumero_conta() +
                "\nNome do titular: " + getTitular() +
                "\nCPF do titular: " + getCpf() +
                "\nSaldo na conta: R$" + getSaldo();
    }
}

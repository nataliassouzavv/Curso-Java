public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public double sacar(double valor) throws SaldoInsuficienteException, ValorInvalidoException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException(valor, saldo);
        }
        if (valor <= 0) {
            throw new ValorInvalidoException(valor);

        }
        if (valor <= saldo) {
            System.out.println("O saque pode ser concluído!");
            saldo -= valor;
            System.out.println("Saldo apos operação" +saldo);
        }

        return saldo;
    }

    public double transferir(double valor, ContaBancaria cb) throws SaldoInsuficienteException, ValorInvalidoException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException(valor, saldo);
        }
        if (valor <= 0) {
            throw new ValorInvalidoException(valor);

        }
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("A transferencia pode ser concluída!Seu saldo é: "+saldo);
        }
        return saldo;
    }
    public double depositar(double valor) throws SaldoInsuficienteException, ValorInvalidoException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException(valor, saldo);
        }
        if (valor <= 0) {
            throw new ValorInvalidoException(valor);

        }
        if (valor <= saldo) {
            System.out.println("O deposito pode ser concluído!");
        }
        return saldo;

    }
}
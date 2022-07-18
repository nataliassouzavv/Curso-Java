public class ContaInvestimento extends ContaBancaria {

    private double saldoFinal;

    @Override
    public void depositar(double saldo) {
        System.out.println("Qual valor deseja depositar na sua conta bancaria?");
    }

    @Override
    public void sacar(double saldo) {
        System.out.println("Qual valor deseja retirar da sua conta bancaria?");
    }

    @Override
    public void transferir(double saldo, ContaBancaria contaBancaria) {
        System.out.println("Deseja transferir qual valor?");
    }

    @Override
    public void calcularSaldo(double saldo) {
        double taxa = (saldo / 100) * 5;
        saldoFinal = saldo + taxa;
        System.out.println("Seu saldo atual é:" + saldoFinal);
    }
}

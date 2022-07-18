public abstract class ContaBancaria {
    private double saldo;

    public abstract void depositar(double saldo);

    public abstract void sacar(double saldo);
    public abstract void transferir(double saldo, ContaBancaria contaBancaria);

    public abstract void calcularSaldo(double saldo);
}

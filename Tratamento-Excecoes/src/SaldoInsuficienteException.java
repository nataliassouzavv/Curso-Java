public class SaldoInsuficienteException extends Exception{
    private double valor, saldo;


    public SaldoInsuficienteException(double valor, double saldo) {
        this.valor = valor;
        this.saldo = valor;
        System.out.println("O valor que você quer sacar é maior que seu saldo");
    }

    public double getValor() {
        return valor;
    }

    public double getSaldo() {
        return saldo;
    }
}

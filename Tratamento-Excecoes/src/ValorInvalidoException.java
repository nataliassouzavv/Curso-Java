public class ValorInvalidoException extends Exception {
    double valor;

    public ValorInvalidoException(double valor) {
        this.valor = valor;
            System.out.println("O valor que você quer sacar é menor ou igual a 0");
    }

    public double getValor() {
        return valor;
    }
}
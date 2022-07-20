public class Movimentacao {

    public static void main(String[] args) {


        ContaBancaria c1 = new ContaBancaria(1000);
        ContaBancaria c2 = new ContaBancaria(1000);


        try {
            c1.sacar(100);
            System.out.println("Saque de 100 feito com sucesso em c1");

        } catch (ValorInvalidoException e) {
            System.out.println("Erro: " + e.getMessage() + ". Valor inv�lido: " + e.getValor());
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro" + e.getMessage() + ". Valor inválido: " + e.getSaldo());
        }

        // Saque de -10 em c1. Falha por causa do valor negativo.
        try {
            c1.sacar(-10);
            System.out.println("Saque de -10 feito com sucesso em c1");
        } catch (ValorInvalidoException e) {
            System.out.println("Erro: " + e.getMessage() + ". Valor inválido: " + e.getValor());
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro" + e.getMessage() + ". Valor inválido: " + e.getSaldo());
        }


        try {
            c1.depositar(100);
            System.out.println("Deposito de 30 feito com sucesso em c1");
        } catch (ValorInvalidoException e) {
            System.out.println("Erro: " + e.getMessage() + ". Valor inv�lido: " + e.getValor());
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage() + ". Saldo dispon�vel: " + e.getSaldo());
        }


        // Deposito de -5 em c1. Falha por causa do valor negativo
        try {
            c1.sacar(-5);
            System.out.println("Deposito de -5 feito com sucesso em c1");
        } catch (ValorInvalidoException e) {
            System.out.println("Erro: " + e.getMessage() + ". Valor inv�lido: " + e.getValor());
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage() + ". Saldo dispon�vel: " + e.getSaldo());
        }

        // Transfer�ncia de 50 de c1 para c2. OK
        try {
            c1.transferir(50, c2);
            System.out.println("Transfer�ncia de 50 de c1 para c2 feita com sucesso");
        } catch (ValorInvalidoException e) {
            System.out.println("Erro: " + e.getMessage() + ". Valor inv�lido: " + e.getValor());
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage() + ". Saldo dispon�vel: " + e.getSaldo());
        }

        // Transfer�ncia de 50 de c1 para c2. Falha porque o saldo � insuficiente
        try {
            c1.transferir(50, c2);
            System.out.println("Transfer�ncia de 50 de c1 para c2 feita com sucesso");
        } catch (ValorInvalidoException e) {
            System.out.println("Erro: " + e.getMessage() + ". Valor inv�lido: " + e.getValor());
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage() + ". Saldo dispon�vel: " + e.getSaldo());
        }
    }
}

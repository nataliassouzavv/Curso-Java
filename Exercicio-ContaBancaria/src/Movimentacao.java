public class Movimentacao {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        ContaInvestimento cv = new ContaInvestimento();
        cc.depositar(1000);
        cc.sacar(1000);
        cc.transferir(1000,cv );
        cc.calcularSaldo(1000);
        cv.calcularSaldo(1000);

        //defini o valor do saldo como 1000

    }
}

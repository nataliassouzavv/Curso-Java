public class Banco  {
    public void realizarOperacao() throws SaldoInsuficienteException, ValorInvalidoException {
        ContaBancaria cb = new ContaBancaria(1000); // infomando qual o valor do saldo da nova conta
        ContaBancaria cb2 = new ContaBancaria(200);
        cb.depositar(50); //deposito valido
        cb.sacar(300);  //saque valido
        cb.transferir(200,new ContaBancaria(100)); //transferencia valida

    }
}

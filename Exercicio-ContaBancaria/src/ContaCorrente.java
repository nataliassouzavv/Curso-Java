import java.util.Scanner;

public class ContaCorrente extends ContaBancaria {

    private double saldoAtual;
    double deposito, sacado, taxa;

    Scanner sc = new Scanner(System.in);

    @Override
    public void depositar(double saldo) {
        System.out.println("Seu saldo é:" + saldo);
        System.out.println("Você pode depositar um valor na conta bancaria! Qual valor deseja depositar?");
        deposito = sc.nextInt();
        saldo+= deposito;
        System.out.println("Seu saldo é:" + saldo);

    }

    @Override
    public void sacar(double saldo) {
        System.out.println("Seu saldo é:" + saldo);
        System.out.println("Você pode sacar um valor da sua conta bancária!Qual valor deseja sacar?");
        sacado = sc.nextInt();
        saldo-= sacado;
        System.out.println("Seu saldo é:" + saldo);

    }

    @Override
    public void transferir(double saldo, ContaBancaria contaBancaria) {
        System.out.println("Seu saldo é:" + saldo);
        System.out.println("Você pode transferir o dinheiro para outra conta bancaria! Qual valor deseja transferir?");
        sacado = sc.nextInt();
        System.out.println("Seu saldo é:" + saldo);
    }

    @Override
    public void calcularSaldo(double saldo) {
        taxa = (saldo / 100) * 10;
        saldoAtual = saldo - taxa;
        System.out.println("Seu saldo é:" + saldoAtual);


    }
}

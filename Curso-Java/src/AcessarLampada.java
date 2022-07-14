package main;

public class AcessarLampada {

    public static void main(String[] args) {
        Lampada lampada1 = new Lampada();


        lampada1.Desligar(false);
        System.out.println(lampada1);

        lampada1.Ligar(true);
        System.out.println(lampada1);
    }




}

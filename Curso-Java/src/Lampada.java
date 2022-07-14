package main;

public class Lampada {

    private boolean ligada;

    public void getLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }


    public void Desligar(boolean ligada) {
        if (ligada == false) {
            System.out.println("a Lampada está desligada");
        }
    }

    public void Ligar(boolean desligada){
   if(ligada == true){   }
        System.out.println("A lampada está ligada");
}
}
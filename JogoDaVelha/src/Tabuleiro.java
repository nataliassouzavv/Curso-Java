import java.util.Scanner;

public class Tabuleiro {

    private int[][] tabuleiro = new int[3][3];

    public Tabuleiro() {
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                tabuleiro[l][c] = 0;
            }
        }
    }

    public void imprimirTabuleiro() {
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                System.out.print(tabuleiro[l][c] + " |");
            }
            System.out.println();
        }
    }

    public int ganhador() {
        for (int l = 0; l < 3; l++) {
            if ((tabuleiro[l][0] == tabuleiro[l][1]) &&
                    (tabuleiro[l][0] == tabuleiro[l][2])) {
                if (tabuleiro[l][0] != 0) {
                    return tabuleiro[l][0];
                }
            }
        }
        for (int c = 0; c < 3; c++) {
            if ((tabuleiro[0][c] == tabuleiro[1][c]) &&
                    (tabuleiro[0][c] == tabuleiro[2][c]) && (tabuleiro[0][c] != 0)) {
                return tabuleiro[0][c];

            }
        }
        if ((tabuleiro[0][0] == tabuleiro[1][1]) && (tabuleiro[0][0] == tabuleiro[2][2]) && (tabuleiro[0][0] != 0)) {
            return tabuleiro[0][0];
        }
        if ((tabuleiro[0][2] == tabuleiro[1][1]) &&
                (tabuleiro[0][2] == tabuleiro[2][0]) &&
                (tabuleiro[0][2] != 0)) {
            return tabuleiro[0][2];
        }
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {

                if (tabuleiro[l][c] == 0) {
                    return 0;
                }
            }
        }
        return 3;
    }

    public boolean efetuarJogada(int jogador, int linha, int coluna) {
        if ((linha < 0) || (linha > 2)) {
            return false;
        }
        if ((coluna < 0) || (linha > 2)) {
            return false;
        }
        if (tabuleiro[linha][coluna] != 0) {
            return false;
        }
        tabuleiro[linha][coluna] = (char) jogador;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tabuleiro jogo = new Tabuleiro();
        int jogador = 1;
        
        int vencedor = jogo.ganhador();
        jogo.imprimirTabuleiro();

        while (vencedor == 0){

            System.out.println("jogador" + jogador);
            System.out.print("Linha: ");
            int linha = sc.nextInt();
            System.out.print("Coluna: ");
            int coluna = sc.nextInt();
            if(!jogo.efetuarJogada(jogador, linha -1, coluna -1)){
                System.out.println("Jogada invalida!");
            } else{
                jogador = (jogador == 1) ? 2 : 1;
            }
            jogo.imprimirTabuleiro();
            vencedor = jogo.ganhador();

        }
        switch (vencedor){
            case 1:
                System.out.println("Vencedor jogador 1");
                break;
            case 2:
                System.out.println("Vencedor jogador 2");
                break;
            case 3:
                System.out.println("Empate");
                break;
        }

    }

}









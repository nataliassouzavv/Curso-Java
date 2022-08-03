import java.util.List;

public class JogoTab {

    private static String[][] tabuleiro = {{" ", " ", " "}, {" ", " ", " "}, {" ", " ", " "}};

    public static void imprimirTabuleiro() {
        for (int l = 0; l < tabuleiro.length; l++) {
            for (int c = 0; c < tabuleiro[l].length; c++) {
                System.out.print(tabuleiro[l][c] + "|");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        imprimirTabuleiro();
        List<Jogada> jogadasList = List.of(
                new Jogada(1, 1, "X"),
                new Jogada(2, 2, "X"),
                new Jogada(2, 0, "X"),
                new Jogada(0, 2, "O"),
                new Jogada(1, 2, "X"),
                new Jogada(1, 0, "O")
        );

        for (Jogada jogada : jogadasList) {
            tabuleiro[jogada.getLinha()][jogada.getColuna()] = jogada.getSimbolo();
        }
        System.out.println();
        imprimirTabuleiro();


        for (Jogada jogada : jogadasList) {
            tabuleiro[jogada.getLinha()][jogada.getColuna()] = Integer.toString(jogada.getPosicaoJogada());
        }

        System.out.println();
        imprimirTabuleiro();
    }

}
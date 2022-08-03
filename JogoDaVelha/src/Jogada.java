public class Jogada {
    private int linha;
    private int coluna;
    private String simbolo;
    private int posicaoJogada;
    private static int jogadaNumero=0;

    public Jogada(int linha, int coluna, String simbolo) {
        this.linha = linha;
        this.coluna = coluna;
        this.simbolo = simbolo;
        jogadaNumero++;
        this.posicaoJogada = jogadaNumero;
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public int getPosicaoJogada() {
        return posicaoJogada;
    }
}
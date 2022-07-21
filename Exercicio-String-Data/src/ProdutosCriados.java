import java.text.NumberFormat;
import java.time.LocalDate;

public class ProdutosCriados extends Produtos {
    public static void main(String[] args) {
        Produtos feijao = new Produtos();
        feijao.setNome("Feijão");
        feijao.setPreco(2.50);
        feijao.setDataDeValidade(LocalDate.of(2022, 10, 04));
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(); //formatando em formato de moeda
        String s1 = numberFormat.format(feijao.getPreco());

        Produtos cafe = new Produtos();
        cafe.setNome("Café");
        cafe.setPreco(19.20);
        cafe.setDataDeValidade(LocalDate.of(2023, 01, 04));
        String s2 = numberFormat.format(cafe.getPreco());

        Produtos beterraba = new Produtos();
        beterraba.setNome("Beterraba");
        beterraba.setPreco(5.99);
        beterraba.setDataDeValidade(LocalDate.of(2022, 8, 10));
        String s3 = numberFormat.format(beterraba.getPreco());


        System.out.println("Nome:" + feijao.getNome() +
                "\nData de validade: " + feijao.getDataDeValidade() +
                "\nPreço: " + s1);

        System.out.println("Nome:" + cafe.getNome() +
                "\nData de validade: " + cafe.getDataDeValidade() +
                "\nPreço: " + s2);

        System.out.println("Nome:" + beterraba.getNome() +
                "\nData de validade: " + beterraba.getDataDeValidade() +
                "\nPreço: " + s3);

    }


}

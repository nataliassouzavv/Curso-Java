import java.util.ArrayList;
import java.util.Collection;

//Na sequência crie uma classe Produtos, responsável por armazenar os produtos criados. Esta
//        classe tem um atributo produtos, do tipo Collection<Produto>, e os métodos
//        adicionar(), que adiciona um produto à coleção, e imprimir(), que imprime todos os
//        produtos.
public class Produtos {
    Collection<Produto> produtoCollection = new ArrayList<>();

    public void adicionar(Produto  produto){
        produtoCollection.add(produto);
    }
    public void imprimir(){
        System.out.println("-------------------------------");
        System.out.println("\n" +produtoCollection + "\n");
    }

}

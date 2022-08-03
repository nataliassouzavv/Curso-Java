import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

//Crie uma classe Produto com dois atributos: nome (String) e valor (double). Implemente a
//interface Comparable de forma que os produtos possam ser ordenados em ordem crescente
//        de valor quando adicionados a um Set. Sobrescreva também os métodos equals() e
//        hashCode(), considerando que produtos iguais são produtos que possuem o mesmo nome. E
//        por último sobrescreva também o método toString(), para mostrar uma representação
//        amigável do produto quando ele for impresso no console.

//        Na sequência crie uma classe Produtos, responsável por armazenar os produtos criados. Esta
//        classe tem um atributo produtos, do tipo Collection<Produto>, e os métodos
//        adicionar(), que adiciona um produto à coleção, e imprimir(), que imprime todos os
//        produtos.
//
public class Produto implements Comparable<Produto> {
    String nome;
    double valor;

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    @Override
    public int compareTo(Produto produto) {
        if (this.valor < produto.valor) {
            return -1;
        }
        if (this.valor > produto.valor) {
            return 1;
        }
        return 0;


    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nValor: " + valor;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) { //verificando se é nulo
            return false;
        }
        if (!(obj instanceof Produto)) { //verificando se é do tipo produto
            return false;
        }

        Produto other = (Produto) obj;

        if (this.nome == other.nome) {
            return true;
        }

        return false;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    public static void main(String[] args) {
        Produto laranja = new Produto("Laranja", 2.50);
        Produto laranja2 = new Produto("Laranja", 2.70);
        Produto maça = new Produto("Maça", 1.45);
        Produto mamao = new Produto("Mamão", 4.95);
        Produto limao = new Produto("Limão", 2.30);
        Produtos produtos = new Produtos();

        Set<Produto> produtoSet = new TreeSet<>(); // TreeSet envia os produtos em ordem crescente de valor definido no método compareTo
        produtoSet.add(laranja);
        produtoSet.add(laranja2); //metodo equals não é implementado no TreeSet
        produtoSet.add(maça);
        produtoSet.add(mamao);
        produtoSet.add(limao);

        for (Produto produto : produtoSet) {
            System.out.println(produto);
        }

        System.out.println("-----------------------------");
        Set<Produto> produtoSetI = new HashSet<>(); //ordem de inserção
        produtoSetI.add(laranja);
        produtoSetI.add(laranja2); //metodo equals é implementado e laranja não é imprimida pois é tem o nome igual
        produtoSetI.add(maça);
        produtoSetI.add(mamao);
        produtoSetI.add(limao);

        for (Produto produto : produtoSetI) {
            System.out.println(produto);
        }
        produtos.adicionar(laranja);
        produtos.adicionar(laranja2);
        produtos.adicionar(limao);
        produtos.adicionar(mamao);
        produtos.adicionar(maça);


        produtos.imprimir();



    }
}



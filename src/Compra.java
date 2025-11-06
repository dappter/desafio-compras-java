//passo 5 - criar a classe Compra com os atributos descricao e preco
public class Compra implements Comparable<Compra> {
    private String descricao;
    private double preco;

    public Compra(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Compra: " +
                "descricao = " + descricao + '\'' +
                ", preço = " + preco;
    }

    @Override
    public int compareTo(Compra outraCompra) {
        return Double.valueOf(this.preco).compareTo(Double.valueOf(outraCompra.preco));
    }
}
//passo 7 - criar construtor
//passo 8 - Getters e toString para mensagem de compra
//passo 16 - comparador

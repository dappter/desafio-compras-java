import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
    private double limite;
    private double saldo;
    List<Compra> listaDeCompras;

    public CartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.listaDeCompras = new ArrayList<>();
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getListaDeCompras() {
        return listaDeCompras;
    }

    public boolean lancarCompra(Compra compra){
        if (this.saldo >= compra.getPreco()){
            this.saldo -= compra.getPreco();
            listaDeCompras.add(compra);
            return true;
        }
        else {
            return false;
        }
    }

}
//passo 1 - criar classe para o cartão de crédito e atribuir limite e saldo
//passo 2 - criar uma lista de compras para armazenar um array das compras
///passo 3 - fazer um construtor da classe e armazenar
/// - limite
/// - saldo (recebe o mesmo valor que o limite)
/// - lista de compras (construir o array para os dados serem inseridos)
//passo 4 - Getters
/// passo 9 - criar um métod de "lançar compra" que recebe uma classe de Compra
/// com os parâmetros:
/// - se o saldo for maior que o preço da compra então saldo - preço
/// - adicionar na lista de compras


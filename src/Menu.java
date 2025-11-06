import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o limite do cartão: ");
        double limite = scanner.nextDouble();
        CartaoDeCredito cartao = new CartaoDeCredito(limite);

        int sair = 1;
        while (sair != 0){
            System.out.println("Digite a descrição da compra: ");
            String descricao = scanner.next();

            System.out.println("Digite o valor da compra: ");
            double preco = scanner.nextDouble();

            Compra compra = new Compra(descricao, preco);
            boolean compraRealizada = cartao.lancarCompra(compra);
            if (compraRealizada){
                System.out.println("Compra realizada!");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                sair = scanner.nextInt();
            } else {
                System.out.println("Saldo insuficiente!");
                sair = 0;
            }
        }
        System.out.println("***********************");
        System.out.println("COMPRAS REALIZADAS:\n");
        Collections.sort(cartao.listaDeCompras);
        for (Compra c : cartao.getListaDeCompras()) {
            System.out.println(c.getDescricao() + " - " +c.getPreco());

        }
        System.out.println("\n***********************");

        System.out.println("\nSaldo do cartão: " +cartao.getSaldo());

    }
}
//passo 9 - criar a Classe Main
//passo 10 - Criar menu personalizado
///atribuir cada valor correspondente como se fosse um array
///para inserir os dados(polimorfismo) - card
//passo 11 - criar uma variável de saída do menu
//passo 12 - loop do menu
//Após isso os valores tem que ser inseridos na Compra (adiciona valor e descrição)
//se a compra for realizada sugerir opção de continuar se não, sai automaticamente
//menu final
//passo 15 - adicionar um comparador para mostrar as contas do menor ao maior preço

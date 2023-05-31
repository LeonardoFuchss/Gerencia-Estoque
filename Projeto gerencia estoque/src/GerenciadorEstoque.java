import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorEstoque {
    Scanner scanner = new Scanner(System.in);
    List<Produto> listaProdutos = new ArrayList<>(); //Declarando uma array list chamada listaProdutos

    public void cadastroProduto() { //Método para cadastrar o produto.

        System.out.println("Olá, essa é a página de cadastros de produtos. Seja bem Vindo! ");
        scanner.nextLine();

        System.out.println("Por favor, insira o nome do produto: ");
        String nome = scanner.nextLine();

        System.out.println("Agora, insire o código do produto: ");
        int codigo = scanner.nextInt();

        System.out.println("Insire o preço de custo deste produto: ");
        double valorCusto = scanner.nextDouble();

        System.out.println("Por fim, defina o preço final deste produto: ");
        double valorVenda = scanner.nextDouble();

        Produto produto = new Produto(nome, codigo, valorCusto, valorVenda); //Declarando o objeto Produto e passando por parametro as variáveis definidas em scanner.
        listaProdutos.add(produto); //adicionando o produto a lista.

        System.out.println(" Produto cadastrado com sucesso! ");
        scanner.nextLine();
        System.out.println(" Aperte enter para voltar ao menu. ");
        scanner.nextLine();
    }
    public void removerProduto() {
        System.out.println("Olá, essa é a página de remoção de estoque do produto. Por favor, digite o código do produto que queira remover: ");
        int codigoProduto = scanner.nextInt();

        boolean produtoEncontrado = false;
        for (Produto produto : listaProdutos) {
            if (produto.getCodigo() == codigoProduto)
                listaProdutos.remove(produto);
            produtoEncontrado = true;
           break;
        }
        if (produtoEncontrado == true) {

            System.out.println(" Produto removido com sucesso. ");
        } else {
            System.out.println(" Produto não encontrado. ");
        }

        scanner.nextLine();
        System.out.println(" Aperte enter para voltar ao menu ");
        scanner.nextLine();
    }
    public void mostrarQuant() {

        System.out.println( listaProdutos.size() + " Produto(s) cadastrado(s) ");
        scanner.nextLine();

        System.out.println("Aperte enter para voltar ao menu ");
        scanner.nextLine();
    }
    public void calcularValorTotalCusto() {
        double valorTotalCusto = 0.0;
        for (Produto produto : listaProdutos) {
            valorTotalCusto += produto.getValorCusto();
        }
        System.out.println( "A soma dos preços de custo dos produtos em estoque é: R$ " + valorTotalCusto);
        scanner.nextLine();
        System.out.println("Aperte enter para voltar ao menu ");

        scanner.nextLine();
    }
    public void calcularValorVendaTotal() {
        double valorTotalVenda = 0.0;
        for (Produto produto : listaProdutos) {
            valorTotalVenda += produto.getValorVenda();
        }
        System.out.println(" A soma dos preços de venda dos produtos em estoque é: R$ " + valorTotalVenda);
        scanner.nextLine();

        System.out.println(" Aperte enter para voltar ao menu ");

        scanner.nextLine();
    }
    public void lucroProdutos(){

        System.out.println(" Vamos calcular o lucro em estoque! ");
        scanner.nextLine();

        System.out.println(" Digite o valor total de custo no estoque: ");
        double custo = scanner.nextDouble();

        System.out.println("Agora, o valor total de venda no estoque: ");
        double venda = scanner.nextDouble();

        System.out.println("O lucro em estoque é de: R$ " + (venda - custo));

        System.out.println(" Pressione enter para voltar ao menu ");
        scanner.nextLine();

        scanner.nextLine();

    }
    public void menu(){
        boolean sair = false;

        while (!sair) {
            System.out.println("============ Menu ============");
            System.out.println("1. Cadastrar produtos ");
            System.out.println("2. Remover produtos ");
            System.out.println("3. Mostrar quantidade total ");
            System.out.println("4. Valor custo total ");
            System.out.println("5. Valor Venda total ");
            System.out.println("6. LUCRO EM ESTOQUE ");
            System.out.println("7. SAIR ");
            System.out.println("ESCOLHA UMA OPÇÃO ");
            System.out.println("==============================");

            int opcao = scanner.nextInt();

            switch (opcao) {

                case 1: cadastroProduto();
                break;

                case 2: removerProduto();
                break;

                case 3: mostrarQuant();
                break;

                case 4: calcularValorTotalCusto();
                break;

                case 5: calcularValorVendaTotal();
                break;

                case 6: lucroProdutos();
                break;

                case 7:
                    sair = true;
                    System.out.println(" PROGRAMA ENCERRADO! " );
                    break;

                default: System.out.println(" Opção inválida. ");
                break;

            }
        }
    }
}

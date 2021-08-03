package ptteste;

import java.util.List;
import java.util.Scanner;

public class Main {
    static ProdutosDB produtosDB = new ProdutosDB();
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

       /* System.out.println("Digite a descricao  do produto");
        String descricao = scan.nextLine();

        System.out.println("Digite o id");
        int id = scan.nextInt();

        Produto p1 = new Produto(id, descricao);*/

        int opcao;
        do {
            System.out.println("1 para cadastrar  ");
            System.out.println("2 para listar");
            System.out.println("0 para sair");
            opcao = scan.nextInt();
            express(opcao);
        }while(opcao != 0);
    }

    public static void express(int opcao){
        switch(opcao){
            case 1 :
                Scanner scan = new Scanner(System.in);
                System.out.println("Digite a descricao  do produto");
                String descricao = scan.nextLine();
                System.out.println("Digite o id");
                int id = scan.nextInt();

                Produto p1 = new Produto(id, descricao);
                produtosDB.addNovoProduto(p1);
                break;

            case 2 :
                List<Produto>listaDeProdutos = produtosDB.getProdutosList();
                for (Produto produto : listaDeProdutos) {
                    System.out.println("ID : " + produto.getId());
                    System.out.println("descricao : " + produto.getDescricao());
                }
                break;
        }
    }
}

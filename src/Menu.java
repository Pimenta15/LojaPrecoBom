//Questão 3
import java.util.Scanner;

public class Menu {
    
    public static void main(String[] args) throws Exception {
        
        int opcaoMenu,tamanho;
        Scanner in = new Scanner(System.in);

        System.out.println("Qual tamanho do vetor de produtos");
        tamanho = in.nextInt();
        System.out.println("------------------------");

        System.out.println("Loja Preço Bom \nSistema de Controle de Estoque");
        System.out.println("\nOpções");
    do{
        System.out.println("1. Cadastro de Produto");
        System.out.println("2. Exibição de dados de um produto");
        System.out.println("3. Exibição de todos os produtos da loja");
        System.out.println("4. Alterar preço de um produto");
        System.out.println("5. Atualizar o estoque de um produto");
        System.out.println("6. Realizar a venda de um produto");
        System.out.println("7. Remover um produto do cadastro");
        System.out.println("0. Sair do programa");
        System.out.println("Digite a opção desejada");

        opcaoMenu = in.nextInt();

        String codigo,descricao,fornecedor;
        double preco;
        int estoque, quantidade = 0;
        Produto manipular;
        CadastroProdutos bomPreco = null;
        switch (opcaoMenu) {
            case 1:
                System.out.println("Digite o codigo do produto");
                codigo = in.next().toUpperCase();
                System.out.println("Digite a descrição do produto");
                descricao = in.next().toUpperCase();
                System.out.println("Digite o fornecedor do produto");
                fornecedor = in.next().toUpperCase();
                System.out.println("Digite o preço do produto");
                preco = in.nextDouble();
                System.out.println("Digite a quantidade de estoque do produto");
                estoque = in.nextInt();
                
                manipular = new Produto(codigo, descricao, fornecedor, preco, estoque);
                bomPreco = new CadastroProdutos(tamanho);
                bomPreco.cadastrarProduto(manipular);

                break;

            case 2:
                System.out.println("Digite o código de um produto");
                codigo = in.nextLine();

                bomPreco.exibirProduto(codigo);

                break;

            case 3:
                bomPreco.exibirProdutos();
                break; 

            case 4:
                System.out.println("Digite o codigo do produto a ter o preço modificado");
                codigo = in.nextLine();
                System.out.println("Digite: \n 1.Aumento \n 2.Desconto");
                int tipoDeAlterarcao = in.nextInt();
                System.out.println("Qual o percentual de alteração?");
                double percentual = in.nextDouble();

                bomPreco.alterarPreco(codigo, percentual, tipoDeAlterarcao);
                break;

            case 5:
                System.out.println("Digite o codigo do produto a ser acrescentado");
                codigo = in.nextLine();
                System.out.println("Digite a quantidade de produto a ser acrescentado");
                quantidade = in.nextInt();

                bomPreco.atualizarEstoque(codigo, quantidade);

                break;

            case 6:
                System.out.println("Digite o codigo do produto a ser vendido");
                codigo = in.nextLine();
                System.out.println("Digite a quantidade de produto a ser vendido");
                quantidade = in.nextInt();

                bomPreco.realizarVenda(codigo, quantidade);

                break;

            case 7:
                System.out.println("Digite o codigo do produto a ser removido");
                codigo = in.nextLine();
                
                bomPreco.removerProduto(codigo);
                
                break;  
            
            case 0:
                System.out.println("Fim do programa"); 
                break;
        
            default:
             System.out.println("opção inválida");
                break;
        }

    }while(opcaoMenu != 0);
       
    }

   
}


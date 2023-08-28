import java.util.Scanner;

public class Menu {
    
    public static void main(String[] args) throws Exception {
        
        int opcaoMenu;
        Scanner in = new Scanner(System.in);

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

        String codigo;

        switch (opcaoMenu) {
            case 1:
                System.out.println("Digite o codigo do produto");
                codigo = in.next();
                
                
                break;

            case 2:
                
                break;

            case 3:
                
                break; 

            case 4:
                
                break;

            case 5:
                
                break;

            case 6:
                
                break;

            case 7:
                
                break;  
            
            case 0:
                
                break;
        
            default:
                break;
        }

    }while(opcaoMenu != 0);
        System.out.println("Fim do programa");
    }

   
}


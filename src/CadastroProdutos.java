//Questão 2
public class CadastroProdutos {
    private Produto[] produtos;
    private int contador;

    public CadastroProdutos(int tamanho) {
        this.produtos = new Produto[tamanho];
        this.contador = 0;
    }
    public Produto[] getProdutos() {
        return produtos;
    }

    public int buscarProduto(String codigo) {
        for (int i = 0; i < contador; i++) {
            if (produtos[i].compareTo(codigo) == 1) {
                return i;
            }
        }
        return -1;
    }

    public void cadastrarProduto(Produto produto) {
        if (buscarProduto(produto.getCodigo()) == -1) {
            if (contador < produtos.length) {
                produtos[contador] = produto;
                contador++;
                System.out.println("Produto cadastrado com sucesso!");
            } else {
                System.out.println("Cadastro de produtos está cheio. Não é possível cadastrar mais produtos.");
            }
        } else {
            System.out.println("Já existe um produto com o mesmo código.");
        }

    }
    
    public void exibirProdutos() {
        for (int i = 0; i < contador; i++) {
            System.out.println(produtos[i]);
            System.out.println("------------------------");
        }
    }

    public void exibirProduto(String codigo) {
        int posicao = buscarProduto(codigo);
        if (posicao != -1) {
            System.out.println(produtos[posicao]);
        } else {
            System.out.println("Produto não encontrado.");
        }
    }
    
    public void alterarPreco(String codigo, double percentual, int tipoAlteracao) {
        int posicao = buscarProduto(codigo);
        if (posicao != -1 ) {
            if( tipoAlteracao == 1){

            produtos[posicao].aplicarAumento(percentual);
            System.out.println("Preço alterado com sucesso.");

            }else if( tipoAlteracao == 2){

            produtos[posicao].aplicarDesconto(percentual);
            System.out.println("Preço alterado com sucesso.");

            }else{System.out.println("Tipo de alteração inválido");}

        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    public void atualizarEstoque(String codigo, int quantidade) {
        int posicao = buscarProduto(codigo);
        if (posicao != -1) {
            produtos[posicao].atualizarEstoque(quantidade);
            System.out.println("Estoque atualizado com sucesso.");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    public void realizarVenda(String codigo, int quantidade) {
        int posicao = buscarProduto(codigo);

        if (posicao != -1) {

            if (produtos[posicao].getEstoque() >= quantidade) {
                
                produtos[posicao].venderProduto(quantidade);

                double total = quantidade*produtos[posicao].getPreco();

                System.out.println("Venda realizada com sucesso. Total a pagar: " + total);
            } else {
                System.out.println("Não há quantidade suficiente em estoque para realizar a venda.");
            }
        } else {
            System.out.println("Produto não encontrado.");
        }
    }
    
    public void removerProduto(String codigo) {
        int posicao = buscarProduto(codigo);
        
        if (posicao != -1) {
            produtos[posicao] = produtos[contador - 1];
            produtos[contador - 1] = null;
            contador--;
            System.out.println("Produto removido com sucesso.");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }
}

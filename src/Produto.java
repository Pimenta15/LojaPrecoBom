public class Produto {
    
    private String codigo;
    private String descricao;
    private String fornecedor;
    private double preco;
    private int estoque;

    public  Produto(String codigo , String descricao, String fornecedor, double preço, int estoque ){

        this.codigo = codigo;
        this.descricao = descricao;
        this.fornecedor = fornecedor;
        this.preco = preço;
        this.estoque = estoque;

    }

    public  Produto(String codigo ){

        this.codigo = codigo;

    }

    public void aplicarDesconto(int percentual){
        
        double desconto = (percentual/100);
        this.preco = this.preco - (desconto*this.preco);

    
    }

    
}

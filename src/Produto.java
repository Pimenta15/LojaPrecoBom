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

    public void aplicarAumento (double percentual){

        double aumento = (percentual/100);
        this.preco = this.preco + (aumento*this.preco);
    }
    
    public void atualizarEstoque(int quantidade){
        this.estoque = estoque + quantidade;
    }


    public void venderProduto(int quantidade){
        this.estoque = estoque - quantidade;
    }


    public String getCodigo() {
        return codigo;
    }


    public String getDescricao() {
        return descricao;
    }

    public int getEstoque() {
        return estoque;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        
        return "Codigo do Produto: "+ codigo+ "\nDescrição: "+ descricao+ "\nFornecedor: "+ fornecedor+ "\nPreço: "+ preco + "\n Quantidade do Estoque: "+ estoque;
    }

    public int compareTo(Produto outro){
        if(this.codigo.equals(outro.getCodigo())== true){
            return 1;
        }else{
            return -1;
        }
    }

}

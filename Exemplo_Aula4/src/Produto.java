public class Produto {
    String descricao;
    double precoCusto;
    double margemLucro;

    /**
     * Cria um novo produto. O produto necessita de uma descricao,
     * um preco de custo nao negativo e uma margem de lucro entre 10 50%
     * @param desc desc String com a descricao do produto. Nao sera validada.
     * @param precoCusto precoCusto Predo de compra do produto. Precisa nao ser negativo.
     * @param margemLucro margemLucro Margem para venda do produto. Deve estar em 10 em 50%
     * e ser passada como um numero absoluto.
     */
    public Produto(String desc, double precoCusto, double margemLucro){
        descricao = desc;
        if (precoCusto < 0){
            precoCusto = 0;
        }
        if (margemLucro < 10 || margemLucro >50){
            margemLucro = 10;
        }
        this.precoCusto = precoCusto;
        this.margemLucro = margemLucro/100;
    }

    /**
     * Responde o valor de venda do produto. Sera um valor nao negativo.
     * @return double maior ou igual a 0.
     */
    public double valorVenda(){
        return precoCusto * (1 + margemLucro);
    }

    @Override
        /** 
         * Representacao em string do Produto. Sera um valor negativo
         * @return A string contendo um valor de venda
         */
    public String toString(){
        return String.format("%s - valor de venda: R$ %s", descricao, valorVenda());
    }
}

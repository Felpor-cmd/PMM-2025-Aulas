/** A classe Conta para sistema bancario. Uma conta tem um numero de indentificacao padrao (nConta). 
 * Nao tem limite de saldo nem de debito.  
 */

public class Conta {
    private String nConta;
    private String cpfProp;
    private double saldo;
    private double limite;

    /**Construtor padrao*/
    public Conta(String nConta, String cpfProp, double saldo, double limite){
        this.nConta = nConta;
        this.cpfProp = cpfProp;
        this.saldo = saldo;
        this.limite = limite;
    }

    /**
     * Tenta fazer operacao de saque. Caso a operacao seja invalidada ( ultrapassando valores limites ou negativos ), retorna
     * o valor do saldo inalterado.
     * @param valor de saque (>0) ou (<= saldo + limite)
     * @return valor do saldo atual
     */
    public double saque(double valor){
        if ( valor <= saldo + limite  &&  valor > 0){
            saldo -= valor;
            return saldo;
        } else {
            return saldo;
        }
    }

    /**
     * Tenta fazer a operaco de deposito. Caso a opercao esteja com o saldo abaixo de 0 as taxas serao aplicadas
     * @param valor , saldo, taxa (se saldo < 0)
     * @return saldo com as taxa debitadas
     */
    public double deposito(double valor){
        if (saldo < 0){
            double taxa = calcularTaxa();
            valor -= taxa;
        }
        saldo += valor;
        return saldo;
    }

    public double calcularTaxa(){
        return(3.0/100) * Math.abs(saldo);
    }

    @Override
    public String toString(){
        return "Conta Bancaria { \n numero da conta =" + nConta +
        "\nCPF do cliente =" + cpfProp +
        "\nSaldo =" + saldo +
        "\nLimite =" + limite + "}";
    }
}

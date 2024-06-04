package br.com.etec.has.livraria.modelos;

import br.com.etec.has.livraria.exceptions.ValorDescontoException;
import br.com.etec.has.livraria.exceptions.ValorNegativoException;

public class DescontoFixo implements Desconto{
    private double valor;

    public DescontoFixo(double valor) {
        valor = this.valor;
    }
    public double aplicar(double preco){
        if (valor > preco){
            throw new ValorDescontoException("O valor do desconto é maior que o preço do produto, e meu lucro vai onde?");
        }
        if (valor < 0){
            throw new ValorNegativoException("O valor já é negativo, quer mais desconto?");
        }
        return preco - this.valor;
    }
}

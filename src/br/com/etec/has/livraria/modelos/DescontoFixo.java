package br.com.etec.has.livraria.modelos;

public class DescontoFixo implements Desconto{
    private double valor;

    public DescontoFixo(double valor) {
        valor = this.valor;
    }
    public double aplicar(double preco){
        preco -= valor;
        return preco;
    }


}

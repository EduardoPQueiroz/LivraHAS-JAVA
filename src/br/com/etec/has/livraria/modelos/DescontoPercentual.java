package br.com.etec.has.livraria.modelos;
//André Nogueira Pissuto e Eduardo Pereira de Queiroz - 2AI

public class DescontoPercentual implements Desconto{
    private double percentual;

    public DescontoPercentual(double percentual) {
        percentual = this.percentual;
    }

    public double aplicar(double preco){
        preco = preco * (percentual/100);
        return preco;
    }
}

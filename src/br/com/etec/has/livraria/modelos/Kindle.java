package br.com.etec.has.livraria.modelos;
//André Nogueira Pissuto e Eduardo Pereira de Queiroz - 2AI

public class Kindle extends Livro implements Oferta{
    private String marcaDAgua;

    @Override
    protected void detalhar() {
        System.out.println("Marca D`Água: " + marcaDAgua);
    }

    public void setMarcaDAgua(String marcaDAgua) {
        this.marcaDAgua = marcaDAgua;
    }

    @Override
    double descontoLivro(double valorDescontado){
        return valor - (valor * 0.15);
    }

    @Override
    public double getValor() {
        return valor;
    }
}


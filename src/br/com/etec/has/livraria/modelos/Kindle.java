package br.com.etec.has.livraria.modelos;

public class Kindle extends Livro {
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
}

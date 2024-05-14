package br.com.etec.has.livraria.modelos;
//André Nogueira Pissuto e Eduardo Pereira de Queiroz - 2AI

public class Revista implements Exemplar, Oferta{
    private String titulo;
    private double valor;
    private Editora editora;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    @Override
    public double getValor() {
        return valor;
    }
}

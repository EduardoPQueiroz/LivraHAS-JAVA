package br.com.etec.has.livraria.modelos;
//André Nogueira Pissuto e Eduardo Pereira de Queiroz - 2AI

public class LivroCortesia extends Livro{
    private String marcaDAgua;

    public void detalhar(){
        System.out.println(marcaDAgua);
    }
    public void setValor(double valor){

    }

    public LivroCortesia(String marcaDAgua) {
        marcaDAgua = this.marcaDAgua;
    }
}

package br.com.etec.has.livraria.modelos;

import br.com.etec.has.livraria.enums.TipoCapaEnum;
import br.com.etec.has.livraria.exceptions.CampoObrigatorioException;
import br.com.etec.has.livraria.exceptions.ValorNegativoException;
import br.com.etec.has.livraria.modelos.Editora;

public abstract class Livro implements Exemplar {
    private String titulo;
    private String sinopse;
    protected double valor;
    private String autor;
    private int qtdPaginas;
    private Editora editora;

    public void exibirLivro(){
        System.out.println("\n-- Detalhes do livro --");
        System.out.println("Título: " + titulo);
        System.out.println("Sinopse: " + sinopse);
        System.out.println("Valor: " + formataValor(descontoParam(10)));
        System.out.println("Autor: " + autor);
        System.out.println("Quantidade de páginas: " + qtdPaginas);
        detalhar();
        editora.exibirEditora();
    }

    protected abstract void detalhar();

    String formataValor(double param){
        return String.format("R$ %.2f", param);
    }

    double descontoLivro(double valorDescontado){
        return valor - (valor * 0.15);
    }
    double descontoParam(double paramDesconto){
        return valor - (valor * (paramDesconto / 100));
    }

    public void setValor(double valor){
        if (valor < 0){
            throw new ValorNegativoException("O valor já é negativo, quer mais desconto? ta viajando.");
        }
        this.valor = valor;
//        cobrarCapa();
    }
    public void setTitulo(String titulo){
        if (titulo == null || titulo == ""){
            throw new CampoObrigatorioException("Esse campo precisa obrigatoriamente ser preenchido!!");
        }
        this.titulo = titulo;
    }
    public String getTitulo() {
        return titulo.toUpperCase();
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor.toUpperCase();
    }

    public void setQtdPaginas(int qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public double getValor() {
        return valor;
    }
}

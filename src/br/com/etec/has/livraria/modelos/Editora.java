package br.com.etec.has.livraria.modelos;

public class Editora {
    private String nome;
    private String site;

    void exibirEditora(){
        System.out.println("\n-- Detalhes br.com.etec.has.livraria.modelos.Editora --");
        System.out.println("Nome da editora: " + nome);
        System.out.println("Site da editora: " + site);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSite(String site) {
        this.site = site;
    }
}

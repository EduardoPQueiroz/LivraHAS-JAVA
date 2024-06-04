package br.com.etec.has.livraria.modelos;

import br.com.etec.has.livraria.exceptions.NomeEditoraException;

public class Editora {
    private String nome;
    private String site;

    void exibirEditora(){
        System.out.println("\n-- Detalhes br.com.etec.has.livraria.modelos.Editora --");
        System.out.println("Nome da editora: " + nome);
        System.out.println("Site da editora: " + site);
    }

    public void setNome(String nome) {
        int qtd_carac = nome.length();
        if (qtd_carac > 3){
            throw new NomeEditoraException("Tem muita letra nesse nome aí man");
        }
        this.nome = nome;
    }

    public void setSite(String site) {
        this.site = site;
    }
}

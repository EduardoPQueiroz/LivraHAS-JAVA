package br.com.etec.has.livraria.construtores;

import br.com.etec.has.livraria.modelos.Livro;
import br.com.etec.has.livraria.modelos.LivroImpresso;

public class TestaReferencias {

    public static void main(String[] args) {
        LivroImpresso livroA = new LivroImpresso();
        livroA.setTitulo("Teste_de_Referencia");
        livroA.setAutor("Adonias");
        System.out.println("LivroA: " + livroA.getTitulo());
        System.out.println("LivroA: " + livroA.getAutor());

        Livro livroB = livroA;
        System.out.println("LivroB: " + livroB.getTitulo());
        System.out.println("LivroB: " + livroA.getAutor());
        livroB.setTitulo("Teste_de_Referencia2");
        System.out.println("LivroB: " + livroB.getTitulo());
        System.out.println("LivroA: " + livroA.getTitulo());

        System.out.println(livroA);
        System.out.println(livroB);


    }

}

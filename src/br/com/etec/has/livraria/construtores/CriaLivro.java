package br.com.etec.has.livraria.construtores;
//André Nogueira Pissuto e Eduardo Pereira de Queiroz - 2AI
import java.sql.SQLOutput;

import br.com.etec.has.livraria.enums.TipoCapaEnum;
import br.com.etec.has.livraria.modelos.*;

public class CriaLivro {
    public static void main(String[] args) {
        //Instanciando Editoras
        Editora rocco = new Editora();
        rocco.setNome("Rocco");
        rocco.setSite("http://www.rocco.com.br");

        Editora JamalBooks = new Editora();
        rocco.setNome("JamalBooks");
        rocco.setSite("http://www.rocco.com.br");

        //Instanciando LivroImpresso
        LivroImpresso primeiroLivro = new LivroImpresso();
        primeiroLivro.setTitulo("Harry Potter e as preda");
        primeiroLivro.setSinopse("Uma pá de magia");
        primeiroLivro.setValor(100);
        primeiroLivro.setAutor("J.K.Rowling");
        primeiroLivro.setEditora(rocco);
        primeiroLivro.setTipoCapa(TipoCapaEnum.DURA);
        primeiroLivro.setQtdPaginas(321);
        primeiroLivro.cobrarCapa();
        primeiroLivro.exibirLivro();

        //Instanciando Kindle
        Kindle livrodigital = new Kindle();
        livrodigital.setTitulo("A Ilíada de Correx");
        livrodigital.setAutor("Luuca Kenzou");
        livrodigital.setEditora(JamalBooks);
        livrodigital.setSinopse("A grande história de Correx na bahia.");
        livrodigital.setQtdPaginas(123);
        livrodigital.setMarcaDAgua("Jamaal");
        livrodigital.exibirLivro();

        //Adicionando na Sacola
        SacolaCompras sacola = new SacolaCompras();
        sacola.adicionar(primeiroLivro);
        sacola.adicionar(livrodigital);

        //Instanciando Revista
        Revista primeiraRevista = new Revista();
        primeiraRevista.setTitulo("Correx Diário");
        primeiraRevista.setValor(15.99);

        //Adicionando Revista na Sacola
        sacola.adicionar(primeiraRevista);

        //Instanciando, e adicionando LivroCortesia na sacola de compras
        LivroCortesia livroCortesia = new LivroCortesia("CorrexNéVIDAS");
        sacola.adicionar(livroCortesia);
    }
}



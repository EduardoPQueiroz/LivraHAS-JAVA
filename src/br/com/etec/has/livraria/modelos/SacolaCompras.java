package br.com.etec.has.livraria.modelos;
//André Nogueira Pissuto e Eduardo Pereira de Queiroz - 2AI

public class SacolaCompras {

    private double total;
    public void adicionar(Exemplar item){
        System.out.println("Adicionado " + item);
        total = total + item.getValor();
        if (item instanceof Oferta){
            total = item.getValor() - 1.25;
        }
    }
}

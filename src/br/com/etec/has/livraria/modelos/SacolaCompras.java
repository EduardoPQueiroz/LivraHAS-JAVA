package br.com.etec.has.livraria.modelos;
//André Nogueira Pissuto e Eduardo Pereira de Queiroz - 2AI

import java.util.ArrayList;
import java.util.List;

public class SacolaCompras {

    //private double total;
    private List<Exemplar> itens = new ArrayList<>();
    public void adicionar(Exemplar item){
        System.out.println("Adicionado " + item);
        try {
            if (item instanceof Oferta){
                Oferta.aplicarDesconto(new DescontoFixo(1));
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        //total = total + item.getValor();
        itens.add(item);
    }

    public void exibirItens(){
        itens.forEach(i -> System.out.println("Valor: " + i.getValor()));
    }
    public double exibirTotal()-{
        return itens.stream().mapToDouble(i -> i.getValor()).sum()  =;
    }

}

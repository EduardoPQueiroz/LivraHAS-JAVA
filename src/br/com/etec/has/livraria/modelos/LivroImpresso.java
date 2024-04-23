package br.com.etec.has.livraria.modelos;

import br.com.etec.has.livraria.enums.TipoCapaEnum;

public class LivroImpresso extends Livro{
    private TipoCapaEnum tipoCapa;
    double getTaxaEnvio(){
        return valor * 0.05;
    }
    public void cobrarCapa(){
        if (tipoCapa == TipoCapaEnum.DURA){
            valor = valor + 5;
        } else if (tipoCapa == TipoCapaEnum.PERSONALIZADA) {
            valor = valor + 10;
        }
    }
    public void setTipoCapa(TipoCapaEnum tipoCapa) {
        this.tipoCapa = tipoCapa;
        cobrarCapa();
    }

    public LivroImpresso() {
        tipoCapa = TipoCapaEnum.DURA;
        cobrarCapa();
    }

    @Override
    protected void detalhar() {
        System.out.println("Tipo de capa: " + tipoCapa);
        System.out.println("Taxa de Envio: " + formataValor(getTaxaEnvio()));
    }
}

package templatemethod;

import chainofresponsability.Item;
import chainofresponsability.Orcamento;
import strategy.impostos.Imposto;

public class Ikcv extends TemplateDeImpostoCondicional {

    public Ikcv(){}

    public Ikcv(Imposto outroImposto) {
        super(outroImposto);
    }

    public boolean temItemMaiorQueCemReaisNo(Orcamento orcamento) {
        for (Item item: orcamento.getItens()) {
            if (item.getValor() > 100) return true;
        }
        return false;
    }

    @Override
    protected double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
    }

    @Override
    protected double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.10;
    }

    @Override
    protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() > 500 && temItemMaiorQueCemReaisNo(orcamento);
    }
}

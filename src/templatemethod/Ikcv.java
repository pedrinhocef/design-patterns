package templatemethod;

import chainofresponsability.Item;
import strategy.impostos.Orcamento;

public class Ikcv extends TemplateDeImpostoCondicional {

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

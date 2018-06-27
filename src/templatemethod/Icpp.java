package templatemethod;

import chainofresponsability.Orcamento;
import strategy.impostos.Imposto;

public class Icpp extends TemplateDeImpostoCondicional {

    public Icpp(){}

    public Icpp(Imposto outroImposto) {
        super(outroImposto);
    }

    @Override
    protected double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.05;
    }

    @Override
    protected double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.07;
    }

    @Override
    protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() > 500;
    }
}

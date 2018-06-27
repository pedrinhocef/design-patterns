package templatemethod;

import chainofresponsability.Orcamento;
import strategy.impostos.Imposto;

public abstract class TemplateDeImpostoCondicional extends Imposto {

    public TemplateDeImpostoCondicional(){}

    public TemplateDeImpostoCondicional(Imposto outroImposto) {
        super(outroImposto);
    }

    public final double calcula(Orcamento orcamento) {
        if (deveUsarMaximaTaxacao(orcamento)) {
            return maximaTaxacao(orcamento) + calculaDoOutroImposto(orcamento);
        } else {
            return minimaTaxacao(orcamento) + calculaDoOutroImposto(orcamento);
        }
    }

    protected abstract double minimaTaxacao(Orcamento orcamento);

    protected abstract double maximaTaxacao(Orcamento orcamento);

    protected abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);


}

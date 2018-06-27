package templatemethod;

import chainofresponsability.Orcamento;
import strategy.impostos.Imposto;

public class ImpostoMuitoAlto extends Imposto {


    public ImpostoMuitoAlto() {
    }

    public ImpostoMuitoAlto(Imposto outroImposto) {
        super(outroImposto);
    }


    @Override
    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.20 + calculaDoOutroImposto(orcamento);
    }
}

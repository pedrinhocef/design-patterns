package templatemethod;

import chainofresponsability.Orcamento;
import strategy.impostos.Iccc;
import strategy.impostos.Icms;
import strategy.impostos.Imposto;
import strategy.impostos.Iss;

public class TesteDeImpostosComplexos  {

    public static void main(String[] args) {

        Imposto alto = new ImpostoMuitoAlto(new Icms(new Iss(new Iccc())));
        Orcamento orcamento = new Orcamento(500);

        System.out.println(alto.calcula(orcamento));

    }
}

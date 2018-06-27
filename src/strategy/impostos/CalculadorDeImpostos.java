package strategy.impostos;

import chainofresponsability.Orcamento;

public class CalculadorDeImpostos {


    public void calcula(Orcamento orcamento, Imposto estrategiaDeImposto) {
        double resultado = estrategiaDeImposto.calcula(orcamento);
        System.out.println(resultado);
    }
}

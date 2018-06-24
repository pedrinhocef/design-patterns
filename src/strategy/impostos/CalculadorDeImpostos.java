package strategy.impostos;

public class CalculadorDeImpostos {


    public void calcula(Orcamento orcamento, Imposto estrategiaDeImposto) {
        double resultado = estrategiaDeImposto.calcula(orcamento);
        System.out.println(resultado);
    }
}

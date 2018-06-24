package strategy.impostos;

public class Iccc implements Imposto {
    @Override
    public double calcula(Orcamento orcamento) {
        if (orcamento.getValor() < 1000){
            System.out.println("strategy.impostos.Iccc abaixo de 1000");
            return orcamento.getValor() * 0.05;
        } else if(orcamento.getValor() <= 3000) {
            System.out.println("strategy.impostos.Iccc acima de 1000 e abaixo de 3000");
            return orcamento.getValor() * 0.07;
        } else {
            System.out.println("strategy.impostos.Iccc acima de 3001");
            return orcamento.getValor() * 0.08 + 30;
        }
    }
}

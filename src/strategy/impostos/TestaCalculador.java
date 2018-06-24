package strategy.impostos;

public class TestaCalculador {

    public static void main(String[] args) {
        Icms icms = new Icms();
        Iss iss = new Iss();
        Iccc iccc = new Iccc();
        Orcamento compras = new Orcamento(3001);


        CalculadorDeImpostos calculador = new CalculadorDeImpostos();
        calculador.calcula(compras,icms);
        calculador.calcula(compras,iss);
        calculador.calcula(compras,iccc);

    }
}

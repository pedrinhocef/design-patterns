public class TestaCalculador {

    public static void main(String[] args) {
        Icms icms = new Icms();
        Iss iss = new Iss();
        Orcamento orcamento = new Orcamento(500);


        CalculadorDeImpostos calculador = new CalculadorDeImpostos();
        calculador.realizaCalculo(orcamento,icms);
        calculador.realizaCalculo(orcamento,iss);

    }
}

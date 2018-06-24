package strategy.investimentos;

public class TesteInvestimento {

    public static void main(String[] args) {
        Conta conta = new Conta();
        Conservador conservador = new Conservador();
        Moderado moderado = new Moderado();
        Arrojado arrojado = new Arrojado();
        conta.deposita(220000);


        RealizadorDeInvestimento investimento = new RealizadorDeInvestimento();
        investimento.realiza(conta,conservador);
        investimento.realiza(conta,moderado);
        investimento.realiza(conta, arrojado);
    }
}

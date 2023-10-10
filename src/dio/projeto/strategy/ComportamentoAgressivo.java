package dio.projeto.strategy;

public class ComportamentoAgressivo implements Comportamento {
    @Override
    public void andar() {
        System.out.println("Movendo-se agressivamente...");
    }
}

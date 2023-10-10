package dio.projeto.strategy;

public class TesteStrategy {
    public static void main(String[] args) {
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.andar();
        robo.andar();
        robo.andar();
        robo.setComportamento(defensivo);
        robo.andar();
        robo.andar();
        robo.andar();
        robo.setComportamento(agressivo);
        robo.andar();
        robo.andar();
        robo.andar();

    }


}

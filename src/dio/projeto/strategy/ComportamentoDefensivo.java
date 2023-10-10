package dio.projeto.strategy;

public class ComportamentoDefensivo implements Comportamento{
    @Override
    public void andar() {
        System.out.println("Movendo-se defensivamente...");
    }
}

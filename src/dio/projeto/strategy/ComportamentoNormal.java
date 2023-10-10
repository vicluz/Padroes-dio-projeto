package dio.projeto.strategy;

public class ComportamentoNormal implements Comportamento{
    @Override
    public void andar() {
        System.out.println("Movendo-se normalmente...");
    }
}

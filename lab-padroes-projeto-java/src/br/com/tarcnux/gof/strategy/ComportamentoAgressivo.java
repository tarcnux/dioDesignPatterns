package br.com.tarcnux.gof.strategy;

public class ComportamentoAgressivo implements Comportamento{
    @Override
    public void mover() {
        System.out.println("Movendo-se agressivamente...");
    }
}

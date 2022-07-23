package br.com.tarcnux.gof;

import br.com.tarcnux.gof.facade.Facade;
import br.com.tarcnux.gof.singleton.SingletonEager;
import br.com.tarcnux.gof.singleton.SingletonLazy;
import br.com.tarcnux.gof.singleton.SingletonLazyHolder;
import br.com.tarcnux.gof.strategy.Comportamento;
import br.com.tarcnux.gof.strategy.ComportamentoAgressivo;
import br.com.tarcnux.gof.strategy.ComportamentoDefensivo;
import br.com.tarcnux.gof.strategy.ComportamentoNormal;
import br.com.tarcnux.gof.strategy.RoboStrategy;

public class Test {
    public static void main(String[] args) {

        // Singleton
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);

        // Strategy
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        var robo = new RoboStrategy();

        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        // Facade
        var facade = new Facade();
        // Abstrai a dificuldade de integração e provê uma interface mais simples
        facade.migrarCliente("Tarcísio Nunes", "88354-250");
    }
}

package br.com.tarcnux.gof;

/**
 * Singleton "apressado"
 * @author Tarcnux
 */
public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {}

    public static SingletonEager getInstancia() {
        return instancia;
    }
}

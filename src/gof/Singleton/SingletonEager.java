package gof.Singleton;

public class SingletonEager {

    private static SingletonEager isntancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getIsntancia() {
        return isntancia;
    }
}


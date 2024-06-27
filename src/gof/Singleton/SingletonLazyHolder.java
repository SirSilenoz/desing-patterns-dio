package gof.Singleton;

public class SingletonLazyHolder {

    public static class InstanceHolder {
        private static SingletonLazyHolder isntancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getIsntancia() {
        return InstanceHolder.isntancia;
    }
}


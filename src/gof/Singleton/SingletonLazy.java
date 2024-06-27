package gof.Singleton;



public class SingletonLazy {

    private static SingletonLazy isntancia;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getIsntancia() {
        if (isntancia == null) {
            isntancia = new SingletonLazy();
        }
        return isntancia;
    }
}


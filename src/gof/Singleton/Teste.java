package gof.Singleton;

public class Teste {
    public static void main(String[] args) {

        SingletonLazy lazy = SingletonLazy.getIsntancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getIsntancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getIsntancia();
        System.out.println(eager);
        eager = SingletonEager.getIsntancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getIsntancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getIsntancia();
        System.out.println(lazyHolder);

    }
}

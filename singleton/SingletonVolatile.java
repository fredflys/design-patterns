public class SingletonVolatile {
    private volatile static SingletonVolatile uniqueInstance;
    private SingletonVolatile() {}
    public static SingletonVolatile getInstance() {
        if (uniqueInstance == null) {
            // double check so that synchronize will only be used the first time through
            synchronized (SingletonVolatile.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new SingletonVolatile();
                }
            }
        }

        return uniqueInstance;
    }
}

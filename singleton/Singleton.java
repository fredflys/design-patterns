public class Singleton {
    // lazy instantiation
    private static Singleton uniqueInstance;
    
    private Singleton() {};
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            return new Singleton();
        }
        return uniqueInstance;
    }
}

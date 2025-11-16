public class Singleton {
    private static int ctr;
    private static Singleton instance;
    private Singleton(){
        ctr = ctr+1;
        System.out.println("Creating only one Instance of this class");
    }

    //Classic Lazy Initialization - Not thread safe
//    public static Singleton getSingletonInstance(){
//        if(instance == null)
//            instance = new Singleton();
//        return instance;
//    }

    //Thread Safe - Synchronized - Slow
//    public static synchronized Singleton getSingletonInstance(){
//        if(instance == null)
//            instance = new Singleton();
//        return instance;
//    }

    //Double checked lock
    public static Singleton getSingletonInstance(){
        if(instance == null)
            synchronized (Singleton.class) {
                if (instance == null)
                    instance = new Singleton();
            }
        return instance;
    }

//    private static class SingletonInner{
//        private static final Singleton INSTANCE = new Singleton();
//    }
//    public static Singleton getInstance(){
//        return SingletonInner.INSTANCE;
//    }
    public void display(){
        System.out.println("Number of instances: " + ctr);
        System.out.println("Hashcode: " + this.hashCode());
    }
}


package PracticeCodes;

public class SingletonDesignPattern  implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    //Eager Singleton
    /*private static SingletonDesignPattern instance = new SingletonDesignPattern();

    public SingletonDesignPattern() {
    }

    public static SingletonDesignPattern getInstance() {
        return instance;
    }*/
    /*##########################################################*/
    // Lazy singleton
    /*private static SingletonDesignPattern instance = null;

    public static SingletonDesignPattern getInstance() {
        if(instance==null){
            instance = new SingletonDesignPattern();
        }
        return instance;
    }*/
    //Thread Safety
    private static SingletonDesignPattern instance = null;

    public static SingletonDesignPattern getInstance(){
        synchronized (SingletonDesignPattern.class){
            if(instance==null){
                instance = new SingletonDesignPattern();
            }
        }
        return instance;
    }

    public enum SingletoneEnum{
        INSTANCE;
        SingletoneEnum(){

        }
    }

}

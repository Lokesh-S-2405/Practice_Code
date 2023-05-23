package PracticeCodes;

public class DemoToPreventReflectionEnum {
    public static void main(String[] args) {
        Singleton instance = Singleton.instance;
        System.out.println(instance.hashCode());
        Singleton instance2 = Singleton.instance;
        System.out.println(instance2.hashCode());
    }

    public enum Singleton {
        instance;
    }
}

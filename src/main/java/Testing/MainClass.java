package Testing;

public class MainClass {
    public static void main(String[] args) {
        College college=new College();
        Class<? extends College> aClass = college.getClass();
        System.out.println(aClass);
    }
}

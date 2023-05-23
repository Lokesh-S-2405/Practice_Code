package Interview;

public class Demo {
    public static void main(String[] args) {
        String string = "DEVELOPERS ARE HERE";
        long count = string.chars().filter(ch -> ch == 'E').count();
        System.out.println(count);
    }
}

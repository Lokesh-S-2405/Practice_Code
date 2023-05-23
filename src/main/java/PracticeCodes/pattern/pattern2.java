package PracticeCodes.pattern;

/*
A
BC
DEF
*/
public class pattern2 {
    public static void main(String[] args) {
        int n=3;
        char ch='A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(ch++);
            }
            System.out.println();
        }
    }
}

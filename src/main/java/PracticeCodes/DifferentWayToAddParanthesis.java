package PracticeCodes;

import java.util.LinkedList;
import java.util.List;

public class DifferentWayToAddParanthesis {
    public static void main(String[] args) {
        String expression = "2*3-4*5";
       /* String ex = expression.substring(0,1);
        System.out.println(ex);*/
       // String expression = "2-1-1";// output [0,2] -->((2-1)-1)=0, (2-(1-1))=2
       List<Integer> integerList = diffWaysToCompute(expression);
        System.out.println(integerList);
    }
        public static List<Integer> diffWaysToCompute(String input) {
            List<Integer> ret = new LinkedList<Integer>();
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == '-' ||
                        input.charAt(i) == '*' ||
                        input.charAt(i) == '+') {
                    String part1 = input.substring(0, i);
                    String part2 = input.substring(i + 1);
                    List<Integer> part1Ret = diffWaysToCompute(part1);
                    List<Integer> part2Ret = diffWaysToCompute(part2);
                    for (Integer p1 : part1Ret) {
                        for (Integer p2 : part2Ret) {
                            int c = 0;
                            switch (input.charAt(i)) {
                                case '+':
                                    c = p1 + p2;
                                    break;
                                case '-':
                                    c = p1 - p2;
                                    break;
                                case '*':
                                    c = p1 * p2;
                                    break;
                            }
                            ret.add(c);}
                    }
                }
            }
            if (ret.size() == 0) {
                ret.add(Integer.valueOf(input));
            }
            return ret;
        }
}

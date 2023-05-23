package PracticeCodes.Week1;

import java.util.Scanner;

class Main {

    public static String StringExpression(String expression) {
        expression = expression.replace("one", "1");
        expression = expression.replace("zero", "0");
        expression = expression.replace("two", "2");
        expression = expression.replace("three", "3");
        expression = expression.replace("four", "4");
        expression = expression.replace("five", "5");
        expression = expression.replace("six", "6");
        expression = expression.replace("seven", "7");
        expression = expression.replace("eight", "8");
        expression = expression.replace("nine", "9");
        expression = expression.replace("plus", "+");
        expression = expression.replace("minus", "-");
            // Replace words with numerals

            // Parse the expression and evaluate the result
            int result = 0;
            String[] terms = expression.split("-");
            if (terms.length > 0) {
                result = Integer.parseInt(terms[0]);
                for (int i = 1; i < terms.length; i++) {
                    result -= Integer.parseInt(terms[i]);
                }
            }

            // Convert the result back into words
            String[] numberWords = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
            String resultInWords = "";
            if (result == 0) {
                resultInWords = "zero";
            } else if (result < 0) {
                resultInWords = "negative ";
                result = -result;
            }
            while (result > 0) {
                resultInWords = numberWords[result % 10] + " " + resultInWords;
                result /= 10;
            }

            // Simplify the result
            resultInWords = resultInWords.replace("zero", "").replace("one", "").replace("negative ", "negative").trim();

            return resultInWords;
        }

    public static void main (String[] args) {
        // keep this function call here
        String expression = "onezeropluseight";
        System.out.print(StringExpression(expression));
    }

}
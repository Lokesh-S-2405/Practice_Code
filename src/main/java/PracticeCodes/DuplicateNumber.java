package PracticeCodes;

public class DuplicateNumber {
    public static void main(String[] args) {
        //int repeatedNumber=0;
        int[] num ={1,1,2,4,6};
        for (int i = 0; i < num.length-1; i++) {
            for (int j = i+1; j <num.length ; j++) {
                if(num[i]==num[j]){
                    System.out.println(num[j]);
                }
            }
        }

    }
}

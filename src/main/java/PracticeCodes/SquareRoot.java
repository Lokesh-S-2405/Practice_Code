package PracticeCodes;

public class SquareRoot {
    public static void main(String[] args) {
        int x=40;
        int p=3;
        //System.out.println(squareRoot(x,p));
        System.out.println(StrictMath.sqrt(40));
    }

    private static double squareRoot(int x,int p) {
        int start=0;
        int end = x;
        double root=0.0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid*mid==x){
               return mid;
            }
            if(mid*mid>x){
                end=mid-1;
            }else {
                start=mid+1;
            }
        }
        double increment=0.1;
         for (int i = 0; i < p; i++) {
            while (root*root<=x){
                root+=increment;
            }
            root-=increment;
            increment/=10;
        }
        return root;
    }
}

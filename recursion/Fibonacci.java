package recursion;

public class Fibonacci {
    public static void main(String[] args) {


        System.out.println(fibonac(5));
    }

    static int fibonac(int n){

        if(n==0){
            return 0;
        }
        else if (n==1){
            return  1;
        }

        return  fibonac(n-1)+fibonac(n-2);


    }





}

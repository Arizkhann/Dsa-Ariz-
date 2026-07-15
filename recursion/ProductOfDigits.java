package recursion;

public class ProductOfDigits {
    public static void main(String[] args) {


        System.out.println(prod(1234));
    }

    static int prod(int n){

        if(n==0){
            return 1;
        }

        return n%10*prod(n/10);

    }



}

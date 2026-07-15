package recursion;

public class CountDigits {
    public static void main(String[] args) {


        System.out.println(countDigit(59223));

    }


    static int countDigit(int n){

        if(n==0){
            return 0;
        }

        return 1+countDigit(n/10);


    }


}

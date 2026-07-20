package recursionPractice;

public class SumOfDigits {
    public static void main(String[] args) {

        int n=2361;
        System.out.println(sumOfDig(n));

    }

    static int sumOfDig(int n){

        if(n==0){
            return 0;
        }

        int digit=n%10;

        return digit+sumOfDig(n/10);



    }


}

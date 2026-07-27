package practice;

public class SubtractTheProdAndSum {
    public static void main(String[] args) {

        int n=342;
        System.out.println(subtractProductAndSum(n));





    }

    static int subtractProductAndSum(int n) {



        int sum=0;
        int prod=1;

        while(n>0){
            int digit=n%10;
            sum=sum+digit;
            prod=prod*digit;

            n=n/10;
        }



        return prod-sum;





    }


}

package recursion;

public class Pract {
    public static void main(String[] args) {

        int n=4;
        System.out.println(oneToN(n));

    }
    static int oneToN(int n){


        if(n==0){
            return 0;
        }





        return n+oneToN(n-1);



    }


}

package recursion;

public class Palindrome {
    public static void main(String[] args) {


        int n=12321;
        if(n==pal(n,0)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }

    }



    static int pal(int n, int reverse){

        if(n==0){
            return reverse;
        }


        int digit=n%10;

        reverse=reverse*10 +digit;
        return      pal(n/10,reverse);






    }
}

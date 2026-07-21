package recursionPractice;

public class Palindrome {
    public static void main(String[] args) {

        int n=1231;




        if((isPalindrome(n,0))==n){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not a palindrome");
        }



    }


    static int isPalindrome(int n,int reverse){

        if(n==0){
            return reverse;
        }
        int digit=n%10;
        reverse=reverse*10+digit;

        return isPalindrome(n/10,reverse);






    }



}

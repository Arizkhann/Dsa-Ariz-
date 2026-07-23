package recursionPractice;

public class Praactt {
    public static void main(String[] args) {

        int n=231;
        System.out.println(reverseNum(n,0));

    }

    static int reverseNum(int n,int reverse){


        if(n==0){
            return reverse;

        }

        int digit=n%10;
        reverse=reverse*10 +digit;

        return reverseNum(n/10,reverse);




    }

}

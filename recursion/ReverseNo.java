package recursion;

public class ReverseNo {
    public static void main(String[] args) {


        System.out.println(reverseNo(1234,0));


    }


    static int reverseNo(int n,int reverse){

        if(n==0){
            return reverse;
        }


        int digit=n%10;



      reverse=reverse*10+ digit;


        return reverseNo(n/10,reverse);




    }


}

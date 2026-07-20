package recursionPractice;

public class ReverseNumber {
    public static void main(String[] args) {

        int num=123;

        reverseAno(num);
    }

    static void reverseAno(int num){

        if(num<=0){
            return ;
        }

        int digit=num%10;
        System.out.print(digit);

         reverseAno(num/10);

    }


}

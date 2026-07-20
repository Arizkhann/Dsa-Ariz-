package recursionPractice;

public class ProductOfDigits {
    public static void main(String[] args) {

        int num=1236;

        System.out.println(prodOfDigits(num));


    }

    static int prodOfDigits(int num){

        if(num<=0){
            return 1;
        }

        int digit=num%10;


        return digit*prodOfDigits(num/10);

    }

}

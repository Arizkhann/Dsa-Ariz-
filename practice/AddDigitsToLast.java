package practice;

public class AddDigitsToLast {
    public static void main(String[] args) {

        int num=38;
        System.out.println(addDigits(num));

    }
    static int addDigits(int num) {

        int sum=0;

        while(num>0){
            int digit=num%10;
            sum+=digit;
            num=num/10;
        }




        if(sum>9){
            return addDigits(sum);
        }

        return sum;

    }
}

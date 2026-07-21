package recursionPractice;

public class PrintDigits {
    public static void main(String[] args) {

        int num=1236;

        printDigitsOfNUm(num);


    }

    static void printDigitsOfNUm(int num){

        if(num<=0){
            return ;
        }

        int digit=num%10;




         printDigitsOfNUm(num/10);
        System.out.print(digit+ " ");

    }


}

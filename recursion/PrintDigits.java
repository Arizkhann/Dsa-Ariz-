package recursion;

public class PrintDigits {
    public static void main(String[] args) {

int n=134;
printdigit(n);

    }

    static void printdigit(int n){

        if(n==0){
            return;
        }




        printdigit(n/10);
        System.out.println(n%10);




    }


}

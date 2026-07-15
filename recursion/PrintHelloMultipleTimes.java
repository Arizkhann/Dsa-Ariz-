package recursion;

public class PrintHelloMultipleTimes {
    public static void main(String[] args) {

        int n=5;
        printHello(n);

    }
    public static void printHello(int n){

        if(n==0){
            return;
        }

        System.out.println("hello");

        printHello(n-1);

    }
}

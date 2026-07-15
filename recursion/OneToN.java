package recursion;

public class OneToN {
    public static void main(String[] args) {
        int n=5;
        printNo(n);
    }

    public  static void printNo(int n){


         if(n<1){
            return;
        }
        printNo(n-1);
        System.out.println(n);


    }


}

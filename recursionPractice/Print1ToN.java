package recursionPractice;

public class Print1ToN {
    public static void main(String[] args) {

        int n=5;
        printUptoN(n);

    }

    static void printUptoN(int n){
        if(n<1){
            return;
        }

        System.out.print(n+" ");

        printUptoN(n-1);



    }

}

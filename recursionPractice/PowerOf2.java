package recursionPractice;

public class PowerOf2 {
    public static void main(String[] args) {

        int n=4;

        System.out.println(powerOf2InNum(n));

    }

    static int powerOf2InNum(int n){


        if(n==0){
            return 1;
        }


        return 2*powerOf2InNum(n-1);


    }


}

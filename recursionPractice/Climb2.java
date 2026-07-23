package recursionPractice;

public class Climb2 {
    public static void main(String[] args) {

        int n=5;
        System.out.println(climb(n));


    }

    static int climb(int n){



        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }


        return climb(n-1)+climb(n-2);


    }





}

package recursion;

public class ClimbingStairProblem {
    public static void main(String[] args) {


        int n=2;

        System.out.println(ways(n));


    }



    static int ways(int n){

        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }

        return   ways(n-1)+ways(n-2);


    }

}

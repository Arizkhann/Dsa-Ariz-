package recursion;

public class NoOf0s {
    public static void main(String[] args) {

        System.out.println(zeross(10200));


    }


    static int zeross(int n){

        if(n==0){
            return 0;
        }

        int count =0;

        if(n%10==0){
            count=1;
        }


        return count +zeross(n/10);


    }


}

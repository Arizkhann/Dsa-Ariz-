package recursion;

public class PowerOf2 {
    public static void main(String[] args) {
        int n=5;
        int res=power(n);
        System.out.println(res);

    }

    public static int power(int n){
        if(n==0){
            return 1;
        }

        return 2*power(n-1);

    }
}

package recursionPractice;

public class CountDigit {
    public static void main(String[] args) {

        int n=1244;
        System.out.println(countDig(n));

    }

    static int countDig(int n){

        int count=0;

        if(n<=0){
            return count;
        }
        int digit=n%10;
        count=count+1;

        return count+countDig(n/10);

    }

}

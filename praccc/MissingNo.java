package praccc;

public class MissingNo {
    public static void main(String[] args) {

        int arr[]={1,2,4,5,6,7};


        int n=arr.length+1;
        int naturalSum=n*(n+1)/2;
        int sum=0;

        for (int nums:arr){
            sum+=nums;
        }


        int missingNo=naturalSum-sum;
        System.out.println(missingNo);


    }
}

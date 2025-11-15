package dsaArray;

public class MissingNo {
    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,7,8,9};
        int n=arr.length+1;
        int naturalSum=n*(n+1)/2;


        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];

        }
        int missing= naturalSum-sum;
        System.out.println("missing no is "+missing);

    }
}

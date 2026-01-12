package slidingWindow;

public class MinSumSubarray {
    public static void main(String[] args) {
        int arr[]={1,-5,6,8,-1};
        int k=2;

        System.out.println(minSumSubArr(arr,k));

    }

    public static int minSumSubArr(int arr[],int k){

        int wSum=0;
        int mSum=Integer.MAX_VALUE;

        for(int i=0;i<k;i++){
            wSum+=arr[i];
        }
        mSum=wSum;

        for (int i=k;i<arr.length;i++){
            wSum=wSum+arr[i]-arr[i-k];

           mSum= Math.min(wSum,mSum);
        }

      return mSum;
    }
}

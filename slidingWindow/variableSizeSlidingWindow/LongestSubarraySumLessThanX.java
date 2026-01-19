package slidingWindow.variableSizeSlidingWindow;

public class LongestSubarraySumLessThanX {
    public static void main(String[] args) {

        int arr[]={2,1,3,4,1};
        int x=5;

        System.out.println(longestSubarray(arr,x));

    }


    private static int longestSubarray(int arr[],int x){


        int left=0;
        int sum=0;

        int maxLen=0;


        for(int right=0;right<arr.length;right++){


                sum=sum+arr[right];

            while (sum>x){
                sum=sum-arr[left];
                left++;
            }

            maxLen=Math.max(sum,right-left+1);
        }
    return maxLen;

    }

}


//

package recursion;

public class BinarySearchInRecursion {
    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,6,7};
        int target=3;
        int start=0;
        int end=arr.length-1;

        System.out.println("target index is "+ solve(arr,target,start,end));


    }

    static int solve(int arr[],int target,int start,int end){

        if(start>end){
            return -1;
        }

        int mid=start+(end-start)/2;

        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]>target){
            end=mid-1;
        }
        if(arr[mid]<target){
            start=mid+1;
        }


        return solve(arr,target,start,end);





    }


}

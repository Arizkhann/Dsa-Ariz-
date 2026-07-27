package Leetcode25;

public class SearchInsertPosition35 {
    public static void main(String[] args) {

        int arr[]={1,3,5,6};
        // for target 2, ans will be 1
        System.out.println(searchIns(arr,5));

    }


    static int searchIns(int arr[],int target){


        int start=0;
        int end=arr.length-1;

        while(start<=end){

            int mid=start+(end-start)/2;


            if(arr[mid]==target){
                return  mid;
            }
            if(arr[mid]>target){
                end=mid-1;
            }
            if(arr[mid]<target){
                start=mid+1;
            }


        }

        return start;

    }

}

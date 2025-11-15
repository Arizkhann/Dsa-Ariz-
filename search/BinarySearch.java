package search;

public class BinarySearch {
    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,6,7};
        int target=5;

        int resukt=binarySearchMethod(arr,target);

        if(resukt != -1){
            System.out.println(resukt);
        }else {
            System.out.println("not found");
        }



    }

    public static int binarySearchMethod(int [] arr,int target){

        int low=0;
        int high=arr.length-1;

        while (low<=high){

            int mid=low+(high-low)/2;

            if(arr[mid]==target){
                return mid;
            } else if (arr[mid]<target) {
                low=mid+1;

            }else{
                high=mid-1;
            }


        }return -1;




    }

}

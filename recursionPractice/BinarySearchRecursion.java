package recursionPractice;

public class BinarySearchRecursion {
    public static void main(String[] args) {

        int arr[]={1,2,3,4,5};

        System.out.println(binarySch(arr,0,arr.length-1,3));

    }

    static int binarySch(int arr[],int start,int end,int target){


        if(start>end){
            return -1;
        }

        int mid=start+(end-start)/2;

        if(target>arr[mid]){

            start=mid;
            start++;
        }
        if(target<arr[mid]){
            end=mid;
            end--;
        }

        if(target==arr[mid]){
            return mid;
        }


        return  binarySch(arr,start,end,target);
    }


}

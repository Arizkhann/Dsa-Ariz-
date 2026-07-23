package recursionPractice;

public class Binary2 {
    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,6};
        int target=5;
        System.out.println(binaryMeth(arr,target,0,arr.length-1));

    }

    static int binaryMeth(int arr[],int target,int start,int end){


        int mid=start+(end-start)/2;

        if(target==arr[mid]){
            return mid;
        }

        if(target>arr[mid]){

            start=mid;
            start++;

        }
        if(target<arr[mid]){

            end=mid;
            end--;

        }


        return binaryMeth(arr,target,start,end);



    }

}

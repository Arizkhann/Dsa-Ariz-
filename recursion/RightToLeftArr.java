package recursion;

public class RightToLeftArr {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        printArr(arr,arr.length);
    }

    static void printArr(int arr[],int index){


        if(index==0){
            return;

        }

        System.out.print(arr[index-1]+" ");

        printArr(arr,index-1);




    }
}

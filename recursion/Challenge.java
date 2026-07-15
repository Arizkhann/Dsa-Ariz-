package recursion;

public class Challenge {
    public static void main(String[] args) {

        int arr[]={1,2,3,4,5};
        printArr(arr,arr.length);

    }

    static void printArr(int arr[],int index){

        if(index==0){
            return;
        }



        printArr(arr,index-1);

        System.out.print(arr[index-1]+" ");


    }


}

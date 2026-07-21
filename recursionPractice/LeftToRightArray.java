package recursionPractice;

public class LeftToRightArray {
    public static void main(String[] args) {

        int arr[]={1,2,31,4,6};
        printArray(arr,0);

    }

    static void printArray(int arr[],int index){

        if(index>=arr.length){
            return;
        }
        System.out.print(arr[index]+" ");

        printArray(arr,index+1);


    }


}

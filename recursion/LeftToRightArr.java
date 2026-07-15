package recursion;

public class LeftToRightArr {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        printNum(arr,0);
    }

    static void printNum(int arr[],int index){

        if(index==arr.length){
            return;
        }
        System.out.print(arr[index]+" ");

        printNum(arr,index+1);


    }


}

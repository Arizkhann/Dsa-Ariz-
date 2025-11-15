package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={3,2,4,1,5,8};
        selectionsorting(arr);

        for (int nums:arr){
            System.out.print(nums+" ");
        }


    }


    public static void selectionsorting(int arr[]){

        int len=arr.length;

        for(int i=0;i<len-1;i++){
            for(int j=i+1;j<len;j++){


                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
        }




    }

}

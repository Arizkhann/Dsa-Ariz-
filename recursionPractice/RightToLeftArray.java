package recursionPractice;

public class RightToLeftArray {

    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,9};

        rightToLeft(arr,0);




    }

    static void  rightToLeft(int arr[],int index){

            if(index>=arr.length){
                return;
            }

        System.out.print(arr[index]+" ");

        rightToLeft(arr,index+1);

    }




}

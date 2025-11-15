package twoPointer;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {


        int arr[]={1,1,2,2,3,4,4};
        int n=arr.length;
        int lenOfNonDupElement=removeDuplicate(arr);
        System.out.println(lenOfNonDupElement);

        for(int i=0;i<lenOfNonDupElement;i++){
            System.out.print(arr[i]+" ");
        }



    }

    private static int removeDuplicate(int[] arr) {

        if(arr.length==0){
            return 0;
        }


        int i=0;

        for(int j=1;j<arr.length;j++){

            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }


        }

        return i+1;


    }
}

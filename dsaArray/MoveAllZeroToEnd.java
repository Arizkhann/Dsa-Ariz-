package dsaArray;

public class MoveAllZeroToEnd {
    public static void main(String[] args) {

        int arr[]={0,2,0,6,5,0,7,3,0,1};


        int pos=0;


        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[pos]=arr[i];
                pos++;
            }
        }

        while (pos<arr.length){
            arr[pos]=0;
            pos++;
        }

        for(int nums: arr){
            System.out.print(nums+" ");
        }



    }
}
/*




public class MoveAllZeroToEnd {
    public static void main(String[] args) {
        int arr[] = {0, 2, 0, 6, 5, 0, 7, 3, 0, 1};

        int pos = 0; // index for non-zero elements

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                // Swap current element with arr[pos]
                int temp = arr[i];
                arr[i] = arr[pos];
                arr[pos] = temp;
                pos++;
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

 */
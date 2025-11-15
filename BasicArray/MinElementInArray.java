package BasicArray;

public class MinElementInArray {
    public static void main(String[] args) {

        int arr[]={22,1,4,5,7,9,2};
        int min=arr[0];

        for(int i=0;i<arr.length;i++){

            if(arr[i]<min){
                min=arr[i];


            }
        }

        System.out.println(min);
    }


}

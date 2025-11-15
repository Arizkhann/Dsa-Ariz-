package search;

public class LinearSearch {

    public static void main(String[] args) {

        int arr[]={1,2,3,4,5};
        int target=4;
        boolean check=false;


        for(int i=0;i<arr.length;i++){

            if(arr[i]==target){
                System.out.println(i);
                check=true;
                break;
            }


        }

        if(!check){
            System.out.println("-1");
        }

    }
}

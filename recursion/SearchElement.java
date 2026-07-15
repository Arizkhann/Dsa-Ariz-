package recursion;

public class SearchElement {
    public static void main(String[] args) {

        int arr[]={2,4,5,7,8};
        int target=8;

        System.out.println(findElement(arr,0,target));


    }

    static int findElement(int arr[], int i, int target){



        if(i>=arr.length){
            return -1;
        }

        if(arr[i]==target){
            return i;
        }

        return findElement(arr,i+1,target);


    }


}

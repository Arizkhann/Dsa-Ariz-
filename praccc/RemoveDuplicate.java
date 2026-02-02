package praccc;

public class RemoveDuplicate {
    public static void main(String[] args) {

        int arr[]={1,2,3,3,4,5,5,6};

        int k=removeDuplicate(arr);
// Unique elements present in it

        for(int i=0;i<k;i++){
            System.out.print(arr[i]+" ");
        }


    }

    public static int removeDuplicate(int arr[]){


        int n=arr.length;
        if(n==0){
            return 0;
        }

        int j=0;

        for(int i=1;i<n;i++){

            if(arr[i]!=arr[j]){
                j++;
                arr[j]=arr[i];
            }

        }

        return j+1;


    }

}

package recursion;

public class CountEleInArr {
    public static void main(String[] args) {



        int arr[]={20,3,20,4,5,4,20};
        int target=4;
        System.out.println(countEle(arr,0,target));

    }

    static int countEle(int arr[],int i,int target){

        int count=0;
        if(i>=arr.length){
            return count;
        }


        if(arr[i]==target){
            count=1;
        }

        return count+countEle(arr,i+1,target);


    }

}

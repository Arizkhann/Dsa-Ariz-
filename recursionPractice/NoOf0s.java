package recursionPractice;

public class NoOf0s {
    public static void main(String[] args) {

        int arr[]={1,2,0,4,0,9};


        System.out.println(noOf0(arr,0));



    }

    static int  noOf0(int arr[],int index){

       if(index>=arr.length){
           return 0;
       }
        int count=0;
       if(arr[index]==0){
           count=1;
       }

        return count+ noOf0(arr,index+1);

    }
}

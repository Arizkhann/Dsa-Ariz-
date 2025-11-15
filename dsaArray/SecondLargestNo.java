package dsaArray;

public class SecondLargestNo {
    public static void main(String[] args) {

        int arr[]={3,5,5,6,1,2,8};
       int res= secondL(arr);

       if(res==Integer.MIN_VALUE){
           System.out.println("no 2nd largest");
       }else {
           System.out.println(res);
       }
    }

    public static int secondL(int arr[]){

        int firstMax=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){

          if(arr[i]>firstMax){
            secondMax=firstMax;
            firstMax=arr[i];
          }else if (arr[i]>secondMax && arr[i]!=firstMax){
              secondMax=arr[i];
          }

        }
        return secondMax;

    }
}

package praccc;

public class SecondLargestElemet {
    public static void main(String[] args) {

        int arr[]={3,5,5,6,1,2,8};
        System.out.println( secondLar(arr));

    }

    public static  int secondLar(int arr[]){

        int firstLar=Integer.MIN_VALUE;
        int secLar=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){

            if(arr[i]>firstLar){
                secLar=firstLar;
                firstLar=arr[i];
            }
            else if (arr[i]>secLar && arr[i]!=firstLar){
                secLar=arr[i];
            }



        }


     return secLar;
    }

}

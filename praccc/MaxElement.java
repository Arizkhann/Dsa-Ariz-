package praccc;

public class MaxElement {
    public static void main(String[] args) {


        int arr[]={2,1,4,8,22,17,33};

        int max=arr[0];


        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                }
        }

        System.out.println(max);

    }
}

package Leetcode25;

public class RemEle {
    public static void main(String[] args) {

        int arr[]={3,2,2,1,3};

        System.out.println(remElement(arr,3));
    }

    static int remElement(int arr[],int val){


        int count=0;

        for(int i=0;i<arr.length;i++){


            if(arr[i]!=val){
                arr[count]=arr[i];
                count++;
            }



        }


        return count;

    }


}

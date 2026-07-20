package recursionPractice;

public class SearchElement {

    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,9};
        int target=9;

        System.out.println(searchEle(arr,target,0));


    }

    static int searchEle(int arr[],int target,int index){


        if(index>=arr.length){
            return -1;
        }


        if(arr[index]==target){
            return index;
        }

       return searchEle(arr,target,index+1);





    }



}

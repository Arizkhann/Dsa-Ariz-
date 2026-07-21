package recursionPractice;

public class FreqOfGivenElem {
    public static void main(String[] args) {

        int arr[]={2,3,4,1,2,5,2,2,4,1,2,6,9,2,1};
        int target=2;

        System.out.println(freqOfELe(arr,target,0));

    }

    static int freqOfELe(int arr[],int target,int index){


        if(index>=arr.length){
            return 0;
        }

        int count=0;
        if(arr[index]==target){
            count=1;
        }

        return count +freqOfELe(arr,target,index+1);
    }

}

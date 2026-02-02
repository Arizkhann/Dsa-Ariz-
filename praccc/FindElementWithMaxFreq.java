package praccc;

import java.util.HashMap;

public class FindElementWithMaxFreq {
    public static void main(String[] args) {

        int arr[]={1,1,2,2,1,3,4,5,3,4,4,4,4,4,4,5,8,9};
        System.out.println(methodToMax(arr));



    }



    public static int methodToMax(int arr[]){

        int maxFreq=0;
        int maxElement=arr[0];
        HashMap<Integer,Integer> map=new HashMap<>();

        for (int nums :arr){
            map.put(nums,map.getOrDefault(nums,0)+1);
        }



        for(Integer key : map.keySet()){
            int freq=map.get(key);
            if(freq>maxFreq){
                maxFreq=freq;
                maxElement=key;
            }



        }


        return maxElement;

    }

}

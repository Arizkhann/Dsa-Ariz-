package praccc;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {


    public static void main(String[] args) {

        int arr[]={5,1,3,4,2};
        int target=7;

        int newArray[]=twoSumMeth(arr,target);
        System.out.println(Arrays.toString(newArray));

    }

    public static int[] twoSumMeth(int arr[],int target){

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++){

            int compliment=target-arr[i];

            if(map.containsKey(compliment)){
                return new int[]{map.get(compliment),i};
            }


            map.put(arr[i],i);




        }

        return new int[]{-1,-1};


    }


}

package leetCode;

import java.util.Arrays;
import java.util.HashMap;

public class L1TwoSum {
    public static void main(String[] args) {

        int arr[]={2,7,11,15};
        int target =9;
       int arr2[]= twoSum(arr,target);

        System.out.println(Arrays.toString(arr2));

    }
    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){

            int compliment=target-nums[i];


            if(map.containsKey(compliment)){
                return  new int[]{map.get(compliment),i};
            }
            map.put(nums[i],i);

        }

        return new int[]{};

    }

}

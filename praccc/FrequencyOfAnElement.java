package praccc;

import java.util.HashMap;

public class FrequencyOfAnElement {
    public static void main(String[] args) {

        int arr[]={1,2,1,3,4,1,2,5,3,4,6,7};

        System.out.println(   freq(arr));

    }


    public static HashMap<Integer,Integer> freq(int arr[]){

        HashMap<Integer,Integer> map=new HashMap<>();



        for(int nums:arr){
            map.put(nums,map.getOrDefault(nums,0)+1);
        }



        return map;

    }

}

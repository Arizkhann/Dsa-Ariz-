package dsaArray;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfEachElement {
    public static void main(String[] args) {
        int arr1[]={1,2,2,1,3,4,1,5,5,6,3};

        freqOfEachEle(arr1);
    }

    public static void freqOfEachEle(int arr[]){

        HashMap<Integer,Integer> map=new HashMap<>();


        for(int nums :arr){
            map.put(nums,map.getOrDefault(nums,0)+1);
        }

      for ( Map.Entry<Integer,Integer> entry : map.entrySet()){
          System.out.println(entry.getKey()+" -> "+entry.getValue());
      }

    }


}

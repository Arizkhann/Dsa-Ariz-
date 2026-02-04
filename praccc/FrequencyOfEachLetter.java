package praccc;


import java.util.HashMap;

public class FrequencyOfEachLetter {
    public static void main(String[] args) {

        String s="aabbccddeewwqqbbhsaes";

        System.out.println(freq(s));

    }

    public  static HashMap<Character,Integer> freq(String s){

        char arr[]=s.toCharArray();

        HashMap<Character ,Integer> map=new HashMap<>();


        for(int i=0;i<arr.length;i++){

            map.put(arr[i],map.getOrDefault(arr[i],0)+1);

        }




        return map;

    }


}

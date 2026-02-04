package praccc;

import java.util.HashMap;

public class FirstRepeatingChar {


    public static void main(String[] args) {

        String s="abbccddeewwqqbbhses";
            firstRepChar(s);


    }

    public  static void firstRepChar(String s){

        char arr[]=s.toCharArray();

        HashMap<Character ,Integer> map=new HashMap<>();


        for(int i=0;i<arr.length;i++){

            map.put(arr[i],map.getOrDefault(arr[i],0)+1);

        }


        for(char ch :arr){
            if(map.get(ch)>1){
                System.out.println(ch);
                break;
            }
        }


    }


}

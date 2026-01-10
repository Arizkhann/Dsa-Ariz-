package practice;

import java.util.HashMap;

public class FreqOfCharInSTring {
    public static void main(String[] args) {

        String s="aabbcccrrdddggghhhhh";


        HashMap<Character,Integer> map=new HashMap<>();

        char arr[]=s.toCharArray();


        for (int i=0;i<s.length();i++){


            map.put(arr[i],map.getOrDefault(arr[i],0)+1);


        }


        System.out.println(map);


    }
}

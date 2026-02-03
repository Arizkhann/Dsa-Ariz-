package praccc;

import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args) {

        String s="MoMM";

        System.out.println(isPalindrome(s));


    }


    public static  String isPalindrome(String  s){

        char arr[]=s.toCharArray();

       int start=0;
        int end=arr.length-1;

        while (start<end){
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }

        String reversed=new String(arr);

       if(s.equals(reversed)){
            return "Palindrome";
        }


        return "Not a palindrome" ;

    }


}

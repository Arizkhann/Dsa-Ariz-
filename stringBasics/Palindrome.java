package stringBasics;

public class Palindrome {
    public static void main(String[] args) {
        String str="DAd";

        if(palindro(str)){
            System.out.println(str +" is a palindrome");

        }else {
            System.out.println("not a palindrome" );
        }


    }



    public static boolean palindro(String str){

        str=str.toLowerCase();
        char arr[]=str.toCharArray();

        int start=0;
        int end=arr.length-1;

        while(start<end){

          if(str.charAt(start)!=str.charAt(end)){
              return false;
          }

            start++;
            end--;

        }
        return true;


    }



}

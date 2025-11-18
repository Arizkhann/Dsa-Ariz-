package twoPointer;

public class StringPalindrome {
    public static void main(String[] args) {

        String str="abA";

        Boolean test=isPalindrome(str);

        if(test){
            System.out.println("palindrome");
        }else {
            System.out.println("Not a palindrome");
        }


    }

    private static Boolean isPalindrome(String str) {

        str=str.toLowerCase();

        int start=0;
        int end=str.length()-1;
        boolean flag=true;

        while (start<end){

            if(str.charAt(start)!=str.charAt(end)){
                flag=false;
                break;
            }


            start++;
            end--;

        }

        return flag;



    }
}

package stringBasics;

public class ReverseAstring {
    public static void main(String[] args) {

        String str="ariz";

        String rev=reverse(str);
        System.out.println(rev);



    }
    public static String reverse(String str){

        char[] arr=str.toCharArray();

        int start=0;
        int end=arr.length-1;

        while(start<end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        return new String(arr);
    }
}

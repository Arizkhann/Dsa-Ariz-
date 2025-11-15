package twoPointer;

public class ReverseVowels {
    public static void main(String[] args) {

        String word="hello";
        System.out.println(reverseVowel(word));

    }

    private static String reverseVowel(String word) {

        char arr[]=word.toCharArray();
        String vowels = "aeiouAEIOU";

        int left=0;
        int right=arr.length-1;


        while (left<right){

            while (left<right && vowels.indexOf(arr[left])==-1){
                left++;
            }

            while (left<right && vowels.indexOf(arr[right])==-1){
                right--;
            }


            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

            left++;
            right--;


        }
        return new String(arr);



    }
}

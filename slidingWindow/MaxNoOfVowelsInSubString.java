package slidingWindow;

public class MaxNoOfVowelsInSubString {
    public static void main(String[] args) {
        String  s="abciiidef";
        int k=3;
        System.out.println(maxNoOfVowelSs(s,k));

    }

    private static int maxNoOfVowelSs(String s, int k){

        char arr[]=s.toCharArray();

        int wCount=0;
        int mCount=Integer.MIN_VALUE;

        for(int i=0;i<k;i++){
            if(isVowel(arr[i])){
                wCount++;
            }
        }
        mCount=wCount;

        for(int i=k;i<arr.length;i++){

            if(isVowel(arr[i])){
                wCount++;
            }

            if(isVowel(arr[i-k])){
                wCount--;
            }

            mCount=Math.max(wCount,mCount);

        }


    return mCount;


    }





    private static boolean isVowel(char ch){

        return ch=='a'  || ch=='e' || ch=='i' || ch=='o' || ch=='u';

    }

}

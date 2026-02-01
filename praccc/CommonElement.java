package praccc;

import java.util.HashSet;

public class CommonElement {
    public static void main(String[] args) {


        int arr1[]={1,2,3,4,1};
        int arr2[]={3,2,6,9};

        System.out.println( commonElement(arr1,arr2));



    }

    public static HashSet<Integer> commonElement(int arr1[],int arr2[]){


        HashSet<Integer> set1=new HashSet<>();

        for(int nums : arr1){
            set1.add(nums);
        }


        HashSet<Integer> set2=new HashSet<>();

        for(int nums :arr2){
            if(set1.contains(nums)){
                set2.add(nums);
            }
        }




        return set2;

    }






}

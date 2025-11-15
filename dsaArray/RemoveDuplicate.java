package dsaArray;

import java.util.LinkedHashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {

        int arr[]={1,2,3,1,2,4,5,6,7,8,3};


        LinkedHashSet<Integer> newSet=removeDup(arr);

        System.out.println(newSet);



    }

    public static LinkedHashSet<Integer> removeDup(int arr[]){



        LinkedHashSet<Integer> set=new LinkedHashSet<>();


        for(int nums : arr){

            set.add(nums);
        }

        return set;

    }

}

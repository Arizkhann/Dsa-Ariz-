package starPattern;

import java.util.Scanner;

public class CenteredPyramid {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println("how many lines u want it to increase");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){

            for(int j=0;j<i;j++){
                System.out.print("*");
            }



            System.out.println();
        }



    }
}

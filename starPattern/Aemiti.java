package starPattern;

import BasicArray.S;

import java.util.Scanner;

public class Aemiti {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
           for (int j=0;j<=i;j++){
               System.out.print(i);
           }


            System.out.println();

        }



    }
}

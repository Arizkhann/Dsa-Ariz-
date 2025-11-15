package starPattern;

import java.util.Scanner;

public class PrintSTar {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("how many starts u want");
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            System.out.print("*");
        }

        }
}

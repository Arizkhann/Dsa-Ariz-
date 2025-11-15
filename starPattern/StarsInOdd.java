package starPattern;

import java.util.Scanner;

public class StarsInOdd {




        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            System.out.println("upto which odd no u wanna print, give a max odd number ");
            int n=sc.nextInt();

            for(int i=1;i<=n;i+=2){
                for(int j=0;j<i;j++){
                    System.out.print("* ");
                }

                System.out.println();

            }


        }
    }




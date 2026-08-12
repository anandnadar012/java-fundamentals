package loops;

import java.util.Scanner;

public class KeepAskingTillUserEnters0 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
         do {
             System.out.print("Enter a number :");
              num = sc.nextInt();
             System.out.println("U have Written : " + num);
         } while ( num !=0);
         sc.close();
    }
}

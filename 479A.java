/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        int p = (a + b * c);
        int g = (a * (b + c));
        int f = (a * b * c);
        int r = ((a + b) * c);
        int j = (a + b + c);
        if (p >= g && p >= f && p >= r && p >= j){
            System.out.println(p);
        }
        else if (g > p && g >= f && g >= r && g >= j){
            System.out.println(g);
        }
        else if (f > p && f > g && f > r && f > j){
            System.out.println(f);
        }
        else if (r > p && r > g && r > f && r > j){
            System.out.println(r);
        }
        else if (j > p && j > g && j > f && j > r){
            System.out.println(j);
        }
     
    }
}
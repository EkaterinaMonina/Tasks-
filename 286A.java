/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int alpha[] = new int[27];
        String s = scanner.next();
        for(int i = 0; i < s.length(); i++)
        {
            alpha[s.charAt(i) - 'a'] = 1;
        }
        int counter = 0;
        for(int i = 0; i < 27; i++)
        {
            counter += alpha[i];
        }
        if(counter % 2 == 0)
        {
            System.out.println("CHAT WITH HER!");
        }
        else
        {
            System.out.println("IGNORE HIM!");
        }
    }
}
/*
Program by: Mr. Tarazi, ASK HS Technology Teacher
Date: May 7th, 2021
Objective: A mathematical sequence is an ordered list of numbers. This question involves a sequence called a hailstone
sequence. If n is the value of a term in the sequence, then the following rules are used to find the next term, if
one exists.
        • If n is 1, the sequence terminates.
        • If n is even, then the next term is n/2.
        • If n is odd, then the next term is 3n + 1.
For this question, assume that when the rules are applied, the sequence will eventually terminate with the term
n = 1.
The following are examples of hailstone sequences
Example 1: 5 -> Sequence 5, 16, 8, 4, 2, 1
Example 2: 8 -> Sequence 8, 4, 2, 1
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scr = new Scanner(System.in);
        System.out.print("Please enter a number --> ");
        int input = scr.nextInt();
        System.out.println(hailStoneSequence(input));

    }

    public static String hailStoneSequence (int n) {
        int count = 1;
        // String to display the elements in the sequence
        String seq = "";

        // Equations for calculation
        while (n>1) {
            if (n%2 ==0) {
                seq += n + " ";
                n /= 2;
            }
            else {
                seq += n + " ";
                n = 3*n+1;
            }

            count ++;
        }
        seq += " 1";
        return "Hailstone Sequence -> " + seq + "\nSequence number -> " + count;
    }
}

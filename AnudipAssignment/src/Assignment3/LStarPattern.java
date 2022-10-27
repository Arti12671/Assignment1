package Assignment3;

import java.util.Scanner;

public class LStarPattern {
	
	public static void main(String args[])   
    {   
    int row,r,c,d;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter rows : ");
    row = s.nextInt();
    for (r = 0; r < row ; r++) 
    {
        System.out.print("* ");
        for (c = 0; c <= row; c++)
        { 
            if (r == row - 1)
                System.out.print("* ");
            else
                System.out.print(" ");
        }
        System.out.print ("\n");
    }
    }

}

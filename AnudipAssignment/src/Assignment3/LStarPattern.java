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
        for (c = 0; c < row-1; c++)
        { 
            if (r == row - 1 || c== 0)
                System.out.print("* ");
            else
                System.out.print(" ");
        }
        System.out.print ("\n");
    }
    }

}

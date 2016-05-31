// Wengang Shi
//Pin: 45
//Test OrderedIntlist and Analytics class
package cse360assign2;

import java.util.Scanner;

public class TestAnalytics 
{
	public static void main(String[] args)
	{
		boolean debugging = false;
		int deb = 0; // for debugging
		Scanner in = new Scanner(System.in);
		System.out.println("debug: enter '0' not: enter '1'");
		deb = in.nextInt();
		if(deb == 1)
		{
			debugging = true;
		}
		if (deb == 0)
		{
			debugging = false;
		}
		
		Analytics analysis = new Analytics(debugging);
		do
		{
			System.out.println("Enter an Integer; Enter any letter to stop");
			int index = in.nextInt();
			analysis.insert(index);
		} while(in.hasNextInt() == true);
		
		analysis.print();  //print array list
		
		// print out mean, median, high, low and number of array.
		
		System.out.print("Mean: " + analysis.mean() + "\n");
		System.out.print("Median: " + analysis.median()+ "\n");
		System.out.print("High: " + analysis.high() + "\n");
		System.out.print("Low: " + analysis.low() + "\n");
		System.out.print("Number of Ints: " + analysis.numInts());
	}

}

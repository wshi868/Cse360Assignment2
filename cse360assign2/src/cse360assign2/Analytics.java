// Wengang Shi
// PIN: 45
// Analytics extends OrderedIntList, and analysis array to mean, median, lowest, highest and num of elements
package cse360assign2;

public class Analytics extends OrderedIntList
{
	private boolean debug = false;
	
	public Analytics(boolean debugging)
	{
		super();
		debug = debugging;
	}
	public double mean()  //mean = sum/count
	{
		double sum = 0;
		double mean = 0;
		if(debug == true) //for debugging
		{
			System.out.print("debug - mean should be 0:" + sum + "\n");
			System.out.print("debug - NumOfIntList: " + count + "\n");
		}
        if(count == 0)
        {
        	if (debug == true) //for debugging
        	{
        		System.out.print("debug - NumOfIntList: " + count + "\n");
        		System.out.print("debug - NumOfIntList should return '0'");
        	}
        	sum = 0;
        }
        else
        {
        	for (int index = 0; index < count; index ++)
        	{
        		sum = sum + amount[index];
        	}
        	mean = sum / count;
        }
        return mean;
	}
	
	public int median()  //odd: median = amount[middle]; even: median = amount[middle-1]
	{
		int middle;
		int median = 0;
		if(debug == true) //for debugging
		{
			System.out.print("debug - median should be 0 :" + median + "\n");
			System.out.print("debug - numOfIntList : "+ count + "\n");
		}
		if(count == 0)
		{
			median = 0;
			if(debug == true)  //for debugging
			{
				System.out.print("debug - NumOfIntList:" + count + "\n");
				System.out.print("debug - NumOfIntList should return '0'");
			}
			
		}
		if (count % 2 !=0)
		{
			middle = (count/2) ;
			median = amount[middle];
			if(debug == true)  //for debugging
			{
				System.out.println("debug - NumOfIntList should be an odd number : "+ count);
				System.out.println("bebug - median: "+ median);
			}
			
		}
		if (count % 2 ==0 && count !=0)	
		{
			middle = (count + 1) / 2;
			median = amount[middle-1];
			if (debug == true)  //for debugging
			{
				System.out.println("debug - NumOfIntList should be an even number : "+ count);
				System.out.println("debug - median: " +median);
			}
		
		}
		return median;
	}

		
		public int high() //highest in array, which is the last element
		{
			int max=0;
			if (debug == true)  //for debugging
			{
				System.out.println("debug - highest number should be the last element" + amount[count-1]);
			}
			if (count == 0)
			{
				max = 0;
				if (debug == true) //for debugging
				{
					System.out.println("debug - NumOfIntList should be '0': "+ count);
					System.out.println("debug - high should return '0':" + max);
				}
			}
			else
			{
				max = amount[count-1];
				if (debug == true)  //for debugging
				{
					System.out.println("debug - NumOfIntList should not be '0': " + count);
					System.out.println("debug - the last element:" + amount[count-1]);
				}
			}
			return max;
		}
		
		public int low()  //lowest one, which is the first element in a array
		{
			int min=0;
			if (debug == true)  //for debugging
			{
				System.out.println("debug - lowest number should be the first element" + amount[0]);
			}
			if (count == 0)
			{
				min = 0;
				if (debug == true)  //for debugging
				{
					System.out.println("debug - NumOfIntList should be '0': "+ count);
					System.out.println("debug - high should return '0':" + min);
				}
			}
			else
			{
				min = amount[0];
				if (debug == true)  // for debugging
				{
					System.out.println("debug - NumOfIntList should not be '0': " + count);
					System.out.println("debug - the first element:" + amount[0]);
				}
			}
			return min;
		}
		
		public int numInts()  // count number of elements
		{
			if (debug = true)   //for debugging
			{
				//System.out.println("debug - NumOfIntList should be: " + count);
			}
			return count;
		}
}

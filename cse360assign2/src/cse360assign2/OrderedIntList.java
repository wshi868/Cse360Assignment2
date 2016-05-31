//cse360
//Wengang Shi 
//1206630980
//PIN: 45
//Order elements in a array

package cse360assign2;

public class OrderedIntList {
	protected int[] amount;
	protected int count;
	
	OrderedIntList ()
	{
		amount = new int[10];
	}
	
	public void insert (int value)  //insert ints into array
	{
		if (count == amount.length)
			grow();
		if (count == 0)
		{
			amount[0] = value;
			count ++;
		}
		else
		{
			int secondIndex = count -1;
			while (secondIndex >=0 && amount[secondIndex] > value)
			{
				amount[secondIndex+1] = amount[secondIndex];
				secondIndex = secondIndex - 1;
			}
			amount[secondIndex+1] = value;
			count = count +1;
		}
	}
	private void grow()
	{
		int []temp = new int[count*2];
		
		for(int index = 0; index < count; index ++)
			temp[index] = amount[index];
		amount = temp;
	}
	public void print()  //print out method
	{
		for (int index = 0; index < count; index ++)
		{
			if (index%5 == 0)
				System.out.print("\n");
			System.out.print(amount[index] + "\t");
		}
		System.out.print("\n");
	}

}

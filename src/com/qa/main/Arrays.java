package com.qa.main;

public class Arrays
{
	public void outputArray(int numberArray[])
	{
		System.out.println(numberArray[0] + " " + numberArray[1] + " " + numberArray[2] +
				" " + numberArray[3] + " " + numberArray[4] + " " + numberArray[5] + " " +
				numberArray[6] + " " + numberArray[7] + " " + numberArray[8] + " " +
				numberArray[9]);
	}
	
	public void createAndPopulateArray(int currentArrayNumber, int numberArray[])
	{
		
		while (currentArrayNumber <= 10)
		{
			for (int i = 0; i < 10; i++)
			{
				numberArray[i] = currentArrayNumber;
				System.out.println(numberArray[i]);
			}
			currentArrayNumber++;
		}
	}

}

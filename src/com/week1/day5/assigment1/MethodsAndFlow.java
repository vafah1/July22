package com.week1.day5.assigment1;

public class MethodsAndFlow 
{

	private String[] stringArray;

	public MethodsAndFlow(String[] stringArray)
	{
		this.stringArray = stringArray;
	}

	public void outputSubset(int startPosition, int numberOfValues)
	{
		for (int i = startPosition; i < (startPosition + numberOfValues); i++) 
		{
			System.out.println(stringArray[i]);
		}
		System.out.println();
	}
			
	public void outputAll() {
		outputSubset(0, stringArray.length);
		
	}
			
	
	
}

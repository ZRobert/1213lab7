//Numbers.java
//Robert Payne
//L02
//6/7/2012
//Lab 8

public class Numbers{

	private int[] theNumbers;
	
	public Numbers(){
	
	theNumbers = new int[]{4, 8, 15, 16, 23, 42};
	}
	
	public boolean checkNumbers(int value){
	
	int temp = value;
	
	for(int i = 0; i < theNumbers.length; i++)
	{
		if(temp == theNumbers[i])
			return true;
	}
// 		if(temp == theNumbers[i])
// 			return true;
// 		else
 			return false;
	}
	
	public int getLength()
	{
		return theNumbers.length;
	} 
} 
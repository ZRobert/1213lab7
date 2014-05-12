//ArraysLab3.java
//Robert Payne
//L02
//6/7/2012
//Lab 8

public class ArraysLab3
{
	public static void main(String[] args)
	{
		int[] arrayA = {2,3,4};
		int[] arrayB = {20, 30, 40};
		
		int j = 5;
		
		Data3 tester = new Data3();
		
		System.out.println("Before tester.fun(numbers): " + "\n j = " + j + "\n arrayA[0] = " + arrayA[0] + "\n arrayB[0] = " + arrayB[0]);
		tester.fun(j, arrayA[0], arrayB);
		System.out.println("After tester.fun(numbers): " + "\n j = " + j + "\n arrayA[0] = " + arrayA[0] + "\n arrayB[0] = " + arrayB[0]);
		
	}
}

class Data3
{
	public void fun(int x, int y, int[] a)
	{
		x = 100;
		y = 200;
		a[0] = 300;
	}
}
//The third argument is updated by the fun method while the first and second arguments are not. 
//The reason for this is because arrayB is passed by reference.
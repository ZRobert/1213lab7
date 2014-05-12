//ArraysLab2.java
//Robert Payne
//L02
//6/7/2012
//Lab 8

class ArraysLab2
{
	public static void main(String[] args)
	{
		double[] fatGrams = new double[]{12.6, 32.0, 2.0, 11.2, 0.5, 3.99};
//		 	fatGrams[0] = 12.6;
// 		fatGrams[1] = 32.0;
// 		fatGrams[2] = 2.0;
// 		fatGrams[3] = 11.2;
// 		fatGrams[4] = 0.5;
// 		fatGrams[5] = 3.99;
// 		
		for(int j = 0; j <= fatGrams.length; j++)
			System.out.println(fatGrams[j]);
		
		for(int j = 0; j < fatGrams.length; j++)
			System.out.println(fatGrams[fatGrams.length -1 - j]);		
		
	}
}//Task 2
//4. Step four causes a runtime error "Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 6"
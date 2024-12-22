/*Question 15:
 Write a program to count how many elements in an array
 {2, 3, 4, 5, 6, 7, 8, 9, 10} are prime numbers.
 Example: 2, 3, 5, and 7 are prime.*/

public class Main5 
{
	public static void  displayArr(int arr[]) 
	{
		System.out.println("Array elements are : ");
		for(int i:arr)
			System.out.print(i+" ");
		System.out.println();
	}
	
	public static int primeCounter(int[] arr)
	{
		int c = 0;
		for(int i : arr)
		{
			int k = 0;
			for(int j = 2; j < i/2; j++)
				if(i % j == 0)
				{
					k++;break;
				}
			if(k==1) c++;		
		}
		
		return c;
	}
	
	public static void main(String[] args) 
	{
		int arr[] = {2, 3, 4, 5, 6, 7, 8, 9, 10};
		displayArr(arr);
		System.out.println("Prime elements : " + primeCounter(arr));
	}
}
/*Question 16:
Count and Print Distinct Elements.
 Write a program to count the number of distinct/unique/non repeated
 elements in an array {1, 2, 2, 3, 4, 4, 5} and print those unique
 elements.*/

public class Main6 
{
	public static void  displayArr(int arr[]) 
	{
		System.out.println("Array elements are : ");
		for(int i:arr)
			System.out.print(i+" ");
		System.out.println();
	}
	
	public static int frequencyCounter(int[] arr,int ele)
	{
		int c = 0;
		for(int i:arr) if(i==ele) c++;
		return c;
	}
	
	public static void uniqueElements(int arr[])
	{
		int len = arr.length;
		int res[] = new int[len];
		for(int i = 0; i < len; i++)
		{
			if(res[i]!=-1)
			{
				res[i] = frequencyCounter(arr, arr[i]);
				for(int j = i+1; j < len; j++) 
					if(arr[i]==arr[j]) 
						res[j] = -1;
			}
		}
		
		int c = 0;
		for(int i = 0; i < len; i++)
			if(res[i]==1) 
			{
				System.out.print(arr[i] + " ");
				c++;
			}
		
		if(c==0)
			System.out.println("No such elements found...!!!");
	}
	
	public static void main(String[] args) 
	{
		int arr[] = {1, 2, 2, 3, 4, 4, 5};
		displayArr(arr);
		System.out.println("Unique elements : ");
		uniqueElements(arr);
	}
}
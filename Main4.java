/*Question 14: Count Elements Appearing Exactly k Times.
 Write a program to count how many elements appear exactly 2 times
 in an array {1, 2, 2, 3, 4, 4, 5, 5}.
 Example: 2, 4, and 5 each appear exactly twice.
 If k time elements are not found then print "No element found".*/

public class Main 
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
	
	public static void elementsFrequency(int arr[],int k)
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
			if(res[i]==k) 
			{
				System.out.print(arr[i] + " ");
				c++;
			}
		
		if(c==0)
			System.out.println("No such elements found...!!!");
	}

	public static void main(String[] args) 
	{
		int arr[] = {1, 2, 2, 3, 4, 4, 5, 5};
		displayArr(arr);
		elementsFrequency(arr,2);
	}
}

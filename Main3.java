/*Question 13: Find the Majority element.
 Print the Element which appeared More than n/2 Times.
 [n is length of the array]
 
 Write a program to find an element in an array
 {3, 3, 4, 2, 4, 4, 2, 4, 4}
 that appears more than n/2 times. If no such element exists,
 display "No majority element."*/

import java.util.Scanner;

public class Main3
{
	public static int[] ceateArray()
	{
		System.out.print("Enter array size : ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.print("Enter array elemets : ");
		for(int i = 0; i < size; i++)
			arr[i] = sc.nextInt();
		return arr;
	}
	
	public static int frequencyCounter(int[] arr,int ele)
	{
		int c = 0;
		for(int i:arr) if(i==ele) c++;
		return c;
	}
	
	public static void elementsFrequency(int arr[])
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
		System.out.println("Elements found more than n/2 times");
		for(int i = 0; i < len; i++)
			if(res[i] >= arr.length/2) 
			{
				System.out.print(arr[i] + " ");
				c++;
			}
		
		if(c==0)
			System.out.println("No such elements found...!!!");
	}

		
	public static void main(String[] args) 
	{
		int arr[] = ceateArray();
		elementsFrequency(arr);
	}
}

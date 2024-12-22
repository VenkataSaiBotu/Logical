/*Question 12:
 Count Elements Greater than Average.
 Write a program to count how many elements in the array
 {10, 20, 30, 40, 50}
 are greater than the average of all the elements.*/

import java.util.Scanner;

public class Main2 
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
	
	public static void  displayArr(int arr[]) 
	{
		System.out.println("Array elements are : ");
		for(int i:arr)
			System.out.print(i+" ");
		System.out.println();
	}

	public static int greaterThanAvg(int arr[])
	{
		double average=0,sum=0;
		for(int i : arr) sum += i;
		average = sum/arr.length;
		
		int count = 0;
		for(int i : arr)
			if(i > average) count++;
		
		return (count == 0) ? -1 : count ;
	}
		
	public static void main(String[] args) 
	{
		int arr[] = ceateArray();
		displayArr(arr);
		System.out.println((greaterThanAvg(arr) != -1)? "Count of elements greater than average : "+greaterThanAvg(arr) : 
			"No such elements found");	
	}
}
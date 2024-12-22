/*Question 11:
 Count Odd and Even Numbers
 Given an array {1, 2, 3, 4, 5, 6}, write a program to count how many
 elements are odd and how many are even.*/

import java.util.Scanner;

public class Main1 
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

	public static void evenAndOddCount(int arr[])
	{
		int ec=0,oc=0,z=0;
		for(int i : arr)
			if(i == 0) z++;
			else if(i%2 == 0) ec++;
			else oc++;
		System.out.println("Even  : " + ec + "\nOdd   : "+oc+"\nZeros : "+z );
	}
		
	public static void main(String[] args) 
	{
		int arr[] = ceateArray();
		displayArr(arr);
		evenAndOddCount(arr);
	}
}
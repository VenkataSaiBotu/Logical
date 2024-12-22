/*Question 21:
 Write java method named findEvenandOddPositionElement that print
 all the elements which is present at even index and also in odd index*/

import java.util.Scanner;

public class Main11 
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
	
	public static void  findEvenandOddPositionElement(int arr[]) 
	{
		System.out.println("Even index elements are : ");
		for(int i:arr)
			if(i%2==0)
			System.out.print(i+" ");
		System.out.println("\nOdd index elements are : ");
		for(int j : arr)
			if(j%2 == 1)
				System.out.print(j + " ");
		System.out.println();
	}
		
	public static void main(String[] args) 
	{
		int arr[] = ceateArray();
		findEvenandOddPositionElement(arr);
	}
}

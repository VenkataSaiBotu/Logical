/*Question 18:
a.Find Maximum Element in an Array.
 Input as: 6 3 2 1 5 5 4
 Output as: Max is: 6
 
b.Find Maximum Element in an Array.
 Input as: 6 3 2 1 5 5 4
 Output as: Max is: 6*/


import java.util.Scanner;

public class Main8 
{
	public static int[] ceateArray(int size)
	{
		int arr[] = new int[size];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < size; i++)
			arr[i] = sc.nextInt();
		sc.close();
		return arr;
	}
	
	public static void  displayArr(int arr[]) 
	{
		System.out.println("Array elements are : ");
		for(int i:arr)
			System.out.print(i+" ");
		System.out.println();
	}
	
	public static int maxFinder(int[] arr)
	{
		int max = Integer.MIN_VALUE ;
		for(int i : arr)
			if(max < i)
				max = i;
		return max;
	}
	
	public static void main(String[] args) 
	{
		System.out.print("Enter array size : ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = ceateArray(size);
		displayArr(arr);
		System.out.println("Maximum is : " + maxFinder(arr));
		sc.close();
	}
}

/*Question 19:
Search for a given Element in an Array if present then print
   "Element found at index : ", if not present print "Element not found"
    Input as: 1 4 3 5 2 6 5
    Enter searching element: 5
    Output: Element found at index 6
 
     Input as: 1 4 3 5 2 6
    Enter searching element: 7
    Output: Element not found*/


import java.util.Scanner;

public class Main9
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
	
	public static int indexFinder(int[] arr,int ele)
	{
		int index=0,flag = 0;
		for(int i = 0; i < arr.length;i++)
		{
			if(ele == arr[i]) 
				{
					index = i;
					flag++;
				}
		}
		if(flag == 0) return -1;
		else return index;
	}
	
	public static void main(String[] args) 
	{
		int arr[] = ceateArray();
		displayArr(arr);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter searching element : ");
		int ele = sc.nextInt();
		System.out.println((indexFinder(arr, ele) == -1) ? "Element not found" : "Element found at index : " + indexFinder(arr, ele));
		sc.close();
	}
}

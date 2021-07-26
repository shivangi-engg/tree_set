//print the smallest element which is greater than the given element
import java.util.*;
import java.lang.*;
public class PrintCeiling
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of array:");
		int n = sc.nextInt();
		int [] arr = new int[n];
		System.out.println("enter the elements of array:");
		for(int i=0; i<n;i++)
		{
			int ele = sc.nextInt();
			arr[i] = ele;
		}
		for(int i=0; i<n;i++)
		{
			printLogic(arr,i);
			
		}

	}

	public static void printLogic(int []arr, int i)
	{
		TreeSet<Integer> tree = new TreeSet<Integer>();
		for(int j=i+1; j<arr.length;j++)
		{
			tree.add(arr[j]);
		}
		int cel;
		if(tree.ceiling(arr[i]) == null)
		{
				cel = -1;
		}
		else
		{
			cel = tree.ceiling(arr[i]);
		}
	
		System.out.print(cel+" ");
	}
}
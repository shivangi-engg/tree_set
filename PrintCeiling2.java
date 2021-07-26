//print the smallest element which is greater than the given element
import java.util.*;
import java.lang.*;
public class PrintCeiling2
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
		printLogic(arr);
	}
	public static void printLogic(int [] arr)
	{
		TreeSet<Integer> tree = new TreeSet<Integer>();
		int n = arr.length;
		int [] res = new int[n];
		for(int i=n-1; i>=0; i--)
		{
			Integer cel = tree.ceiling(arr[i]);
			if(cel == null)
			{
				res[i] = -1;
			}
			else
			{
				res[i] = cel;
			}
			tree.add(arr[i]);
		}
		for(int x:res)
		{
			System.out.print(x+" ");
		}
	}	
}
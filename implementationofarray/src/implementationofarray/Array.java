package implementationofarray;

import java.util.Scanner;

public class Array {
private int arr[];
private Scanner scan = new Scanner(System.in);
public Array(int n)
{
	arr = new int [n];
}
public void insert()
{
	System.out.println("Enter the position"+ (arr.length-1));
	int pos = scan.nextInt();
	System.out.println("Enter the Element");

	int elem = scan.nextInt();
	arr[pos] = elem;
}

public void delete()
{
	System.out.println("Enter the position of the element");
	int pos = scan.nextInt();
	System.out.println("Element deleted is:"+ arr[pos]);
	arr[pos] = 0;
}
public void display()
{
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.print(arr[i]+" ");
	}
	System.out.println();
}
}

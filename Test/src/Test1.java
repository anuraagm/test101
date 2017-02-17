import java.util.Scanner;

//import java.lang.*;
public class Test1 {
    
//	System.out.println();
	
	public Test1() {
		// TODO Auto-generated constructor stub
    	System.out.println();
	}
	
	public static void main(String args[]){
		int i=0;
		System.out.println("Enter stack size: ");
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		System.out.println("Enter the elements: ");
		int a[] = new int [size];
		for(i = 0; i < size; i++)
		{
			a[i] = s.nextInt();
		}
		System.out.println("The stack is: ");
		for(i = size-1; i >=0; i--)
		{
			System.out.println(a[i]);
		}
	    System.out.println("Popping the top element: ");	
	    System.out.println("The stack is now: ");
	    size -=1;
	    int len = size;
	    for(i = size-1; i >= 0; i--)
	    {
	    	System.out.println(a[i]);
	    }
	    System.out.println("Enter the element to push: ");
	    int elem = s.nextInt();
	   	a[size] = elem;
	   	System.out.println("The stack is now: ");
	   	for(i = size; i >= 0; i--)
	   	{
    		System.out.println(a[i]);
	    }
	}
}

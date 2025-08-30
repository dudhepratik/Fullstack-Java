Swap First and Last Element (Without Third Variable)
 Write a program to swap the first element and the last element of an array without using a third (temporary) variable.
 Example Input:
Array = [7, 14, 21, 28, 35]
 Expected Output:
Before Swap: [7, 14, 21, 28, 35]
After Swap:  [35, 14, 21, 28, 7]




import java.util.*;
class Shift{

	static void inputArray(int []A){
		Scanner scanner=new Scanner(System.in);
		 System.out.println("Enter Element" + A.length);
		for(int i=0;i<A.length;i++){
			
			 A[i]=scanner.nextInt();
		}

	}
	static void printarr(int []A){
		for(int i=0;i<A.length;i++){
			System.out.print(A[i]+" ");
		}
	}
	

	static void shift(int []A){
		 A[0]=A[0]+A[A.length-1];
		 A[A.length-1]=A[0]-A[A.length-1];
		 A[0]=A[0]-A[A.length-1];


		
		for(int i=1;i<A.length-1;i++){
			A[i]=A[i];
		}
				
	}

	public static void main(String args[]){
			
		Scanner s= new Scanner(System.in);
		System.out.print("enter array size");
		int size=s.nextInt();
		int arr[]=new int[size];
		inputArray(arr);
		printarr(arr);
		shift(arr);
		printarr(arr);

	}
}

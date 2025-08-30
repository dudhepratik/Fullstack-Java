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
	
		for(int i=0;i<A.length-1;i++){
		 A[i]=A[i]+A[i+1];
		 A[i+1]=A[i]-A[i+1];
		 A[i]=A[i]-A[i+1];

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

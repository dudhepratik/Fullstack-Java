import java.util.*;
class Reverse{

	static void inputArray(int []A){
		Scanner scanner=new Scanner(System.in);
		 System.out.println("Enter Element" + A.length);
		for(int i=0;i<A.length;i++){
			
			 A[i]=scanner.nextInt();
		}

	}
	static void printarr(int []A){
		System.out.print("Before Reverse ");
		for(int i=0;i<A.length;i++){
			System.out.println(A[i]+" ");
		}
	}

	static void reverse(int []A){
		System.out.print("After Reverse ");
		for(int i=A.length-1;i>=0;i--){
			System.out.print(A[i]+" ");
		}
	}



	public static void main(String args[]){
			
		Scanner s= new Scanner(System.in);
		System.out.print("enter array size");
		int size=s.nextInt();
		int arr[]=new int[size];
		inputArray(arr);
		printarr(arr);
		reverse(arr);

	}
}

Array Case 8: Shift Last Element to First
WAP to shift last element to first from array.
 Example Input:
input: {10,20,30,40,50}
output:{50,10,20,30,40}




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
		int temp=A[A.length-1];
		int temp2=A[0];

		
		for(int i=1;i<A.length-1;i++){
			A[i]=A[i];
		}
		A[0]=temp;
		A[A.length-1]=temp2;



		
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

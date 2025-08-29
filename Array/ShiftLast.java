import java.util.*;
class ShiftLast{

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
	

	static void shiftLast(int []A){
		int temp=A[A.length-1];
		
		for(int i=A.length-1;i>0;i--){
			A[i]=A[i-1];
		}
		A[0]=temp;


		
	}



	public static void main(String args[]){
			
		Scanner s= new Scanner(System.in);
		System.out.print("enter array size");
		int size=s.nextInt();
		int arr[]=new int[size];
		inputArray(arr);
		printarr(arr);
		shiftLast(arr);
		printarr(arr);

	}
}

import java.util.*;
class ReverseWithOutThird{

static void inputArray(int A[]){
	Scanner s=  new Scanner (System.in);
	for(int i=0;i<A.length;i++){
		A[i]=s.nextInt();
	}
}
static void reverse(int A[]){
	
	for(int i=0;i<A.length/2;i++){
		A[i]=A[i]+A[A.length-1-i];
		A[A.length-1-i]=A[i]-A[A.length-1-i];
		A[i]=A[i]-A[A.length-1-i];
		
	}
	
}
static void printarr(int []A){
		for(int i=0;i<A.length;i++){
			System.out.print(A[i]+" ");
		}
	}



	public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.print("Enter a size of array");
    	int size=s.nextInt();
    	int arr[]=new int[size];
    	inputArray(arr);
    	printarr(arr);
    	reverse(arr);
    	printarr(arr);
	}
}

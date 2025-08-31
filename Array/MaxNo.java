import java.util.*;
class MaxNo{

static void inputArray(int A[]){
	Scanner s=  new Scanner (System.in);
	for(int i=0;i<A.length;i++){
		A[i]=s.nextInt();
	}
}
static int maxno(int A[]){
	int max=A[0];
	for(int i=0;i<A.length;i++){
		if(A[i]>max){
			max=A[i];
		}
				
	}
	return max;
	
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
    	System.out.println(maxno(arr));
    	
	}
}

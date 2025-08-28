import java.util.*;

class SumOdd{

	static void inputArray(int A[]){
	Scanner s=  new Scanner (System.in);
	for(int i=0;i<A.length;i++){
		A[i]=s.nextInt();
	}
}
static int sumOdd(int A[]){
	int sum=0;
	for(int i=0;i<A.length;i++){
		if(A[i]%2!=0){
			sum+=A[i];
		}
	
	}
	return sum;
}
	public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.print("Enter a size of array");
    	int size=s.nextInt();
    	int arr[]=new int[size];
    	inputArray(arr);
    	System.out.print(sumOdd(arr));
	}
}

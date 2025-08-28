import java.util.*;

class Average{
	static void inputArray(int A[]){
	Scanner s=  new Scanner (System.in);
	for(int i=0;i<A.length;i++){
		A[i]=s.nextInt();
	}
}
static int sumOfArray(int A[]){
	int sum=0;
	for(int i=0;i<A.length;i++){
		sum+=A[i];
		
	}
	return sum;
}

   static int count( int A[]){
   	int cnt=0;
   	for(int i=0;i<A.length;i++){
		cnt++;
		
	}
	return cnt;
   }

static int average(int A[]){
	int sum=sumOfArray(A);
	int cnt=count(A);
	int avg=sum/cnt;
	return avg;
}
	public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.print("Enter a size of array");
    	int size=s.nextInt();
    	int arr[]=new int[size];
    	inputArray(arr);
    	System.out.print(average(arr));
	}
}

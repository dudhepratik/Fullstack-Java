import java.util.*;
class Twopair{

static void inputArray(int A[]){
	Scanner s=  new Scanner (System.in);
	for(int i=0;i<A.length;i++){
		A[i]=s.nextInt();
	}
}
static void pair(int A[],int target){
	for(int i=0;i<A.length;i++){
		for(int j=i+1;j<A.length;j++){
			if(A[i]+A[j]==target){
				System.out.println(A[i]+"  "+A[j]);
			}


		}
	}
				
}
	
static void printarr(int []A){
		for(int i=0;i<A.length;i++){
			System.out.println(A[i]+" ");
		}
	}



	public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.print("Enter a size of array");
    	int size=s.nextInt();
    	int arr[]=new int[size];
    	inputArray(arr);


    	System.out.print("Enter target");
    	int target=s.nextInt();

    	System.out.println("Array elements are: ");
        printarr(arr);

        System.out.println("Pairs Are");
    	pair(arr ,target);
    	
    	
	}

}

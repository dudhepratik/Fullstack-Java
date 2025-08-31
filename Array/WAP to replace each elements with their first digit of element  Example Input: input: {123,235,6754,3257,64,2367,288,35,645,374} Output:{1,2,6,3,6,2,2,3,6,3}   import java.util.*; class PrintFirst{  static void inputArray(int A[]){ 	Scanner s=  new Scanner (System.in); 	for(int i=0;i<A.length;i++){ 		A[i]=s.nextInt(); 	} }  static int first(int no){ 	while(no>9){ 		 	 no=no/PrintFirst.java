WAP to replace each elements with their first digit of element

Example Input:
input: {123,235,6754,3257,64,2367,288,35,645,374}
Output:{1,2,6,3,6,2,2,3,6,3}


import java.util.*;
class WAP to replace each elements with their first digit of element

Example Input:
input: {123,235,6754,3257,64,2367,288,35,645,374}
Output:{1,2,6,3,6,2,2,3,6,3}


import java.util.*;
class PrintFirst{

static void inputArray(int A[]){
	Scanner s=  new Scanner (System.in);
	for(int i=0;i<A.length;i++){
		A[i]=s.nextInt();
	}
}

static int first(int no){
	while(no>9){
		
	 no=no/10;

	}
	return no;
}
static void firstDigit(int A[]){
	for(int i=0;i<A.length;i++){
		int no=A[i];
		int n=first(no);
		A[i]=n;

		
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


    	System.out.println("Array elements are: ");
        printarr(arr);

        System.out.println("First Elements Array Are");
        firstDigit(arr);
        printarr(arr);
    	
    	
    	
	}

}

{

static void inputArray(int A[]){
	Scanner s=  new Scanner (System.in);
	for(int i=0;i<A.length;i++){
		A[i]=s.nextInt();
	}
}

static int first(int no){
	while(no>9){
		
	 no=no/10;

	}
	return no;
}
static void firstDigit(int A[]){
	for(int i=0;i<A.length;i++){
		int no=A[i];
		int n=first(no);
		A[i]=n;

		
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


    	System.out.println("Array elements are: ");
        printarr(arr);

        System.out.println("First Elements Array Are");
        firstDigit(arr);
        printarr(arr);
    	
    	
    	
	}

}


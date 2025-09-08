    5
   44
  333
 2222
11111

class Program{
	public static void main(String[] args) {
		int n=5;
		for(int i=n;i>=1;i--){

			for(int sp=1 ; sp<i  ; sp++)	
				System.out.print(" ");

			for(int j=n;j>=i;j--)
				System.out.print(i);

			System.out.println();
		}	
	}
}

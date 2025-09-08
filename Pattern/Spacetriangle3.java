    1
   12
  123
 1234
12345


class Program{
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++){

			for(int sp=i ; sp<n  ; sp++)	
				System.out.print(" ");

			for(int j=i;j>=1;j--)
				System.out.print(j);

			System.out.println();
		}	
	}
}

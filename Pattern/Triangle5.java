/*
5
45
345
2345
12345
*/

class Program1{
	public static void main(String[] args) {
		int n=10;
		for(int i=n;i>=1;i--){  
			for(int j=i;j<=n;j++){
				 System.out.print(j+"\t");
			}
			System.out.println();
		}
	}
}


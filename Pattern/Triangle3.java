1
12
123
1234
12345
*/
class Program1{
	public static void main(String[] args) {
		int n=10;
		for(int i=1;i<=n;i++){  // i++ ++i i+=1 i=i+1
			for(int j=1;j<=i;j++){
				 System.out.print(j+"\t");
			}
			System.out.println();
		}
	}
}

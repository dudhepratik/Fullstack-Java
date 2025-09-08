5
54
543
5432
54321
*/
class Program1{
	public static void main(String[] args) {
		int n=10;
		for(int i=n;i>=1;i--){  
			for(int j=n;j>=i;j--){
				 System.out.print(j+"\t");
			}
			System.out.println();
		}
	}
}

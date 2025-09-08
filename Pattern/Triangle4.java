1
21
321
4321
54321
*/
class Program1{
	public static void main(String[] args) {
		int n=10;
		for(int i=1;i<n;i++){  
			for(int j=i;j>=1;j--){
				 System.out.print(j+"\t");
			}
			System.out.println();
		}
	}
}

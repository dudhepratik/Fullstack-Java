1
2  6
3  7  10
4  8  11  13
5  9  12  14  15
*/
class Program2{

	public static void main(String[] args) {
		
		int n=5; int cnt=1;

		for(int i=n;i>=1;i--){  
			  int c=cnt;
			 for(int j=n;j>=i;j--){ 
			 	System.out.print(c +"\t");
			 	c=c+(j-1);
			 }
			 cnt++;
			 System.out.println();
		}


	}

}

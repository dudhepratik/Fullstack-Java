5   
9     4
12    8     3
14	  11    7    2
15    13    10   6   1
*/
class Program3{
	public static void main(String[] args) {
		int n=5; int cnt=n;
		for(int i=n;i>=1;i--){
            int c=cnt;
			for(int j=i;j<=n;j++){
				System.out.print(c+"\t");
				c=c-(j+1);
			}
			System.out.println();
			cnt=cnt+(i-1);
		}
	}
}

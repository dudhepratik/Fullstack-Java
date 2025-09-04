/*
AAAAA
BBBBB
CCCCC
DDDDD
EEEEE
*/

class Square{

	public static void main(String[] args) {
			int n=5;
			for(int i=1;i<=n;i++){
				for(int j=1;j<=5;j++){
					System.out.print( (char)(64+i) +" ");
				}
				System.out.println();
			}
	}

}

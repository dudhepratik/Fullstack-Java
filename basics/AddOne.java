class AddOne{
	public static void main(String args[]){			
			int num=12903;
			System.out.println(num);

			int unit=(num%10+1)%10;
			num=num/10;
			int tens=(num%10+1)%10;
			num=num/10;
			int hundread=(num%10+1)%10;
			num=num/10;
			int thousand=(num%10+1)%10;
			num=num/10;
			int tenth=(num%10+1)%10;

			System.out.println("OUTPUT");
			System.out.print(tenth);
			System.out.print(thousand);
			System.out.print(hundread);
			System.out.print(tens);
			System.out.print(unit);
	}

}

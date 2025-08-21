Q1) Two numbers are input through the keyboard into two
locations C and D. Write a program to interchange the
contents of C and D


class Swap{

	public static void main(String[] args) {

		int num1=10;
		int num2=20;
		int temp;

		System.out.println("num1 "+num1);
		System.out.println("num2 "+num2);

		temp=num1;   // temp==>10
		num1=num2;   // num1==>20 
		num2=temp;   // num2==>10;

		System.out.println("num1 "+num1);
		System.out.println("num2 "+num2);
	}

}

import java.util.Scanner;

public class FibonacciNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Range For Fibonacci Series: ");
		int n=sc.nextInt();
		int n1=0,n2=1;//Fibonacci always starts with 0 and 1 that's why.
		
		do
		{
			System.out.print(n1+" ");
			int n3=n1+n2;
			n1=n2;
			n2=n3;
		}while(n1<=n);
	}
}
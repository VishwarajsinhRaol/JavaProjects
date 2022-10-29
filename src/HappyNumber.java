import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Any Number: ");
		int n=sc.nextInt();
		int temp=n;
		
		while(n>9)
		{
			int sum=0;
		do
		{
			int r=n%10;
			sum=sum+r*r;
			n=n/10;
		}while(n!=0);
		n=sum;
		}
		
		if(n==1 || n==7)
			System.out.println(temp+" Is Happy Number");
		else
			System.out.println(temp+" Is Not Happy Number");
	}
}
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Any Number: ");
		int n=sc.nextInt();
		int count=0,sum=0;
		
		for(int i=1;i<=n;i++)
		{
			boolean rs=isPrime(i);
			if(rs==true)
			{
				count++;
				System.out.print(i+" ");
				sum=sum+i;
			}
		}
		System.out.println();
		System.out.println("Prime Numbers Till "+n+" Is: "+count);
		System.out.println("Sum Of "+n+" Prime Numbers Are: "+sum);
	}
	
	static boolean isPrime(int n)
	{
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
}
import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Any Number: ");
		int n=sc.nextInt();
		int sum=0,temp=n;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
				sum=sum+i;
		}
		if(sum==temp)
			System.out.println(n+" Is Perfect Number.");
		else
			System.out.println(n+" Is Not Perfect Number.");
	}
}
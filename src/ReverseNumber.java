import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Any Number: ");
		int n=sc.nextInt();
		int rev=0,temp=n;
		do
		{
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
		}while(n!=0);
		System.out.println("Reverse Of "+temp+" Is: "+rev);
		
		if(temp==rev)
			System.out.println(temp+" Is Palindrome.");
		else
			System.out.println(temp+" Is Not Palindrome.");
	}
}
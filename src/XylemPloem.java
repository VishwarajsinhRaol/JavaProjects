import java.util.Scanner;

public class XylemPloem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Any Number: ");
		int n=sc.nextInt();
		int esum=0,msum=0,temp=n;
		
		do
		{
			int r=n%10;
			if(temp==n || n<10)
				esum=esum+r;
			else
				msum=msum+r;
			n=n/10;
		}while(n!=0);
		
		if(esum==msum)
			System.out.println(temp+" Is Xylem Number.");
		else
			System.out.println(temp+" Is Phloem Number.");
			
	}
}
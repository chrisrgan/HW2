import java.util.Scanner;


public class palindrome2 
{
	public static void main(String[] args)
	{
		
		int i,j,k,num;
		
		System.out.println("How many steps is your palindrome?");
		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();

		for (i=1; i<=choice; i++)
		{
			num=1;
			
			for (j=1; j<=i-1;j++)
			{
				System.out.print(num);
				num++;	
			}
			
			for (k=i; k>=1; k--)
			{
				System.out.print(num);
				num--;
			}		
			
			System.out.println();
		}
	}	
}
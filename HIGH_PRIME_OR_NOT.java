import java.util.*;
public class HIGH_PRIME_OR_NOT {
	public static void main(String[] args) {
		System.out.println("Enter a number ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=0,i;
		for( i=1;i<=n;i++)
		{
		   if(n%i==0)
		   {
		        c++;	        
		   }
		}
		if(c==2)
		       System.out.println("prime number ");
		else
		System.out.println("Not a prime number "); 
	}
}
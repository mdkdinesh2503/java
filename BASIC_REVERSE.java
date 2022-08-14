import java.util.Scanner;
public class BASIC_REVERSE {
	public static void main(String[] args) {
		int n,i,s=0,h,p=1,j;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a limit from: ");
		i=sc.nextInt();
		System.out.print("Enter a limit to: ");
		n = sc.nextInt();
		System.out.println("the reverse from "+i+" to "+n+" is: ");
		while(n>=i) {
		    System.out.println(n);
		    n=n-1;
		}
		System.out.print("Enter a sum limit: ");
		h=sc.nextInt();
		System.out.print("the sum from "+i+" to "+h+" is: ");
		for(i=1;i<=h;i++) {
		    s=s+i;
		}
		i=1;
	    System.out.println(s);
	    System.out.print("the product from "+i+" to "+h+" is: ");
		for(j=1;j<=h;j++) {
		    p=p*j;
		}
	    System.out.println(p);
	}
}
import java.util.Scanner;
public class BASIC_POWER_BASE {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int b,N=1,e,i;
		System.out.print("ENTER THE BASE: ");
		b=sc.nextInt();
		System.out.print("ENTER THE EXPONENT: ");
		e=sc.nextInt();
		for(i=1;i<=e;i++) {
			N=N*b;
		}
		System.out.print(b+" to the power "+e+" is: "+N);
	}
}
import java.util.*;
public class BASIC_FIBANOCCI_SERIES {
	public static void main(String[] args) {
		Scanner v = new Scanner(System.in);
		int n1=0,n2=1,n3;
		System.out.print("Enter total elemens: ");
		int n=v.nextInt();
		System.out.print(n1+" "+n2);
		for(int i=2;i<n;++i) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
	}
}
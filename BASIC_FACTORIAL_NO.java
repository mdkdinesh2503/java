import java.util.*;
public class BASIC_FACTORIAL_NO {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int n=sc.nextInt(),f=1;
		for(int i=1;i<=n;i++) {
			f=f*i;
		}
		 System.out.println(f);
	}
}
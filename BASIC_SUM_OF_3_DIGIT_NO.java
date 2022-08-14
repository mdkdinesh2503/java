import java.util.Scanner;
public class BASIC_SUM_OF_3_DIGIT_NO {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,d,s=0;
		n=sc.nextInt();
		while(n!=0) {
			d=n%10;
			s=s+d;
			n=n/10;
		}
		System.out.println("the sum of given number is : "+s);
	}
}

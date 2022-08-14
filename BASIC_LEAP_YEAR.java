import java.util.Scanner;
public class BASIC_LEAP_YEAR {
	public static void main(String[] args) {
		int n;
		System.out.print("Enter an Year : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if((n%400==0)&&(n%100!=0)||(n%4==0)) {
		     System.out.println("\n"+n+" is a leap year");
		}else {
		     System.out.println("\n"+n+" is not a leap year");
		}
	}
}
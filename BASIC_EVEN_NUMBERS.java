import java.util.Scanner;
public class BASIC_EVEN_NUMBERS {
	public static void main(String[] args) {
		int n,i;
		System.out.print("Enter a limit : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("THE EVEN NUMBERS BETWEEN 1 to "+n+" is: ");
		for(i=1;i<=n;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
}
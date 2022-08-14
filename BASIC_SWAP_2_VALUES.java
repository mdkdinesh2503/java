import java.util.Scanner;
public class BASIC_SWAP_2_VALUES {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int A,B;
		System.out.print("Enter value of A is: ");
		A=sc.nextInt();
		System.out.print("\nEnter value of B is: ");
		B=sc.nextInt();
		A=A+B;
		B=A-B;
		A=A-B;
		System.out.println("Swap value of A is: "+A);
		System.out.println("Swap value of B is: "+B);
	}
}
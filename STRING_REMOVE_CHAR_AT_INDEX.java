import java.util.Scanner;
public class STRING_REMOVE_CHAR_AT_INDEX {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the string name: ");
		String str=sc.nextLine();
		String a,b;
		int n;
		System.out.print("index of the char: ");
		n=sc.nextInt();
		a = str.substring(0,n);
		b = str.substring(n+1,str.length());
		System.out.print("the final original string is: ");
		System.out.print(a+b);
	}
}
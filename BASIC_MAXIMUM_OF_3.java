import java.util.Scanner;

public class BASIC_MAXIMUM_OF_3 {
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		System.out.println("first person value is: "+a);
		b=sc.nextInt();
		System.out.println("second person value is: "+b);
		c=sc.nextInt();	
		System.out.println("third person value is: "+c);
		if(a>b&a>c) {
			System.out.println(a+" is greater");
		}
		if(a<b&a<c) {
			System.out.println(a+" is lesser");
		}
		if(b>a&b>c) {
			System.out.println(b+" is greater");
		}
		if(b<a&b<c) {
			System.out.println(b+" is lesser");
		}
		if(c>a&c>b) {
			System.out.println(c+" is greater");
		}
		if(c<a&c<b) {
			System.out.println(c+" is lesser");
		}
	}
}
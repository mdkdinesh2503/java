import java.util.Scanner;
public class BASIC_AGE_TO_VOTE {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		n=sc.nextInt();
		System.out.println("the age given is: "+n);
		if(n>=18) {
			System.out.println("the age is eligible to vote");
		}else {
			System.out.println("the age is not eligible to vote");
		}
		
	}

}

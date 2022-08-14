import java.util.*;
public class BASIC_ARMSTRONG_NO {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Armstrong Number:  ");
		int org,n=sc.nextInt(),r;
		int arm=0;
		org=n;
		while(org!=0) {
			r=org%10;
		    arm=arm+(r*r*r);
			org=org/10;
		}
		if(arm==n){
			System.out.println("it is Armstrong number");
		}else {
			System.out.println("it is not Armstrong number");
		}
	}
}
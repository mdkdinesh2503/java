import java.util.Scanner;
public class BASIC_GCD_OF_2_NO {
	public static void main(String[] args) {
		int n1,n2,Temp,GCD=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number 1: ");  
		n1=sc.nextInt();
		System.out.print("\nenter number 2: ");  
		n2=sc.nextInt();
		System.out.print("\n GCD of "+n1+" and "+n2+" is ");  
		while(n2!=0)  {  
			Temp=n2;  
			n2=n1%n2;  
			n1=Temp;  
		}  
		GCD = n1;  
		System.out.print(GCD);  
	}
}

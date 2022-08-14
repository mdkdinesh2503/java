import java.util.*;
public class STRING_ARRAY_ORDER {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the array size: ");
		int a=sc.nextInt();
		String s[]=new String[a];
		sc.nextLine();
		for(int i=0;i<a;i++) {
			 s[i]=sc.nextLine();
		}
		System.out.println("enter the case:\n	1.press 1 backwards.\n\t2.press2 middle front.\n\t3.press 3 forward.");
		System.out.print("enter your choice: ");
		int c=sc.nextInt();
		switch (c) {
			case 1:
				for(int i=a-1;i>=0;i--) {
					System.out.print(s[i]+"  ");
				}
				break;
			case 2:
				System.out.print("enter the position: "); 
				int n=sc.nextInt();
				for(int i=n;i<a;i++) {
					System.out.print(s[i]+"  ");
				}
				for(int i=0;i<n;i++) {
					System.out.print(s[i]+"  ");
				}
				break;
			case 3:
				for(int i=0;i<a;i++) {
					System.out.print(s[i]+"  ");
				}
				break;
		}
	}
}
import java.util.Scanner;
public class ARRAY_DELETE_PARTICULAR_INDEX {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,p,n;
		System.out.print("Enter the no. of elements:- ");
		n=sc.nextInt();
		int a[]=new int[n+1];
		System.out.println("the elements are:- ");
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.print("Enter the position of elements to delete:- ");
		p=sc.nextInt();
		for(i=p;i<n;i++) {
			a[i]=a[i+1];	
		}
		n=n-1;
		System.out.println("After deleting the element:- ");
		for(i=0;i<n;i++) {
			System.out.print(a[i]+" ");	
		}
	}
}
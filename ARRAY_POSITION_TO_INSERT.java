import java.util.*;
public class ARRAY_POSITION_TO_INSERT {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,p,n,h;
		System.out.print("Enter the no. of elements:- ");
		n=sc.nextInt();
		int a[]=new int[n+1];
		System.out.println("the elements are:- ");
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.print("Enter the position of elements:- ");
		p=sc.nextInt();
		System.out.print("Enter the elements to insert:- ");
		h=sc.nextInt();
		for(i=(n-1);i>=(p-1);i--) {
			a[i+1]=a[i];
		}
		a[p]=h;
		System.out.println("After inserting the element:- ");
		for(i=0;i<n;i++) {
			System.out.print(a[i]+",");	
		}
		System.out.println(a[n]);
	}
}
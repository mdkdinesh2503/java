import java.util.*;
public class ARRAY_ODD_EVEN_ORDER {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the array size: ");
		int a=sc.nextInt();
		int arr[]=new int[a];
		for(int i=0;i<a;i++) {
			System.out.print("the element "+(i+1)+" is: ");
			arr[i]=sc.nextInt();
		}
		System.out.print("the odd numbers after even numbers are:");
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]%2!=0) {
				System.out.print(arr[i]);
			}
		}
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]%2==0) {
				System.out.print(arr[i]);
			}
		}
		
	}
}
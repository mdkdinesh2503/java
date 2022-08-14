import java.util.*;
public class ARRAY_AVERAGE {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the array size:  ");
		int a=sc.nextInt(),s=0;
		int arr[]=new int[a];
		System.out.println("The Elements are :-");
		for(int i=0;i<a;i++) {
			System.out.print("Element "+(i+1)+" is: ");
			arr[i]=sc.nextInt();
		}
		System.out.println("elements : "+Arrays.toString(arr));
		System.out.print("The Average of Elements are :-");
		for(int i=0;i<a;i++) {
			s=s+arr[i];
		}
		int avg=s/a;
		System.out.print(avg);
	}
}
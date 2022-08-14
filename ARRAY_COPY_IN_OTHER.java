import java.util.*;
public class ARRAY_COPY_IN_OTHER {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the array size:  ");
		int a=sc.nextInt(),i;
		int arr[]=new int[a];
		int arr1[]=new int[a];
		System.out.println("The Elements are :-");
		for(i=0;i<a;i++) {
			System.out.print("Element "+(i+1)+" is: ");
			arr[i]=sc.nextInt();
		}
		System.out.print("array 1 is :  ");
		System.out.println("elements : "+Arrays.toString(arr));
		for(i=0;i<a;i++) {
			arr1[i]=arr[i];
		}
		System.out.println("array 2 is having 0 elements!!");
		System.out.println("after updating the array 2 elements:-");
		System.out.print("array 2 is :  ");
		System.out.println("elements : "+Arrays.toString(arr1));
	}
}
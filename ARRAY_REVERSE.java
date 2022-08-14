import java.util.*;
public class ARRAY_REVERSE {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the array size:  ");
		int a=sc.nextInt(),s=0;
		int arr[]=new int[a];
		int arr2[]=new int[a];
		System.out.println("The Elements are :-");
		for(int i=0;i<a;i++) {
			System.out.print("Element "+(i+1)+" is: ");
			arr[i]=sc.nextInt();
		}
		System.out.println("Original elements : "+Arrays.toString(arr));
		System.out.println("The reverse of Elements is :-");
		for(int i=arr.length-1,j=0;i>=0;i--,j++) {
			arr2[j]=arr[i];
		}
		System.out.println("reverse elements : "+Arrays.toString(arr2));
	}
}
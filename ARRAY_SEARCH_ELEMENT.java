import java.util.*;
public class ARRAY_SEARCH_ELEMENT {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the array size:  ");
		int a=sc.nextInt(),i,c=0;
		int arr[]=new int[a];
		System.out.println("The Elements are :-");
		for(i=0;i<a;i++) {
			System.out.print("Element "+(i+1)+" is: ");
			arr[i]=sc.nextInt();
		}
		System.out.println("elements : "+Arrays.toString(arr));
		System.out.println("Specific value is:  ");
		int s=sc.nextInt();
		for(i=0;i<a;i++) {
			if(s==arr[i]) {
				c=c+1;
			}
		}
		System.out.println("Specific value "+s+" is repeating "+c+" times!!!!!!");
	}
}
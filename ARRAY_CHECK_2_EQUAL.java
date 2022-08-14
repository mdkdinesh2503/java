import java.util.*;
public class ARRAY_CHECK_2_EQUAL {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the array 1 size:  ");
		int a=sc.nextInt(),i,j;
		int arr[]=new int[a];
		System.out.println("The Elements are :-");
		for(i=0;i<a;i++) {
			System.out.print("Element "+(i+1)+" is: ");
			arr[i]=sc.nextInt();
		}
		System.out.print("array 1 is :  ");
		System.out.println("elements : "+Arrays.toString(arr));
		System.out.print("Enter the array 2 size:  ");
		int a1=sc.nextInt();
		if(a!=a1) {
			System.out.print("array size is not equal, so we can't check!!!!!");
		}else {
			int arr1[]=new int[a1];
			for(i=0;i<a;i++) {
				System.out.print("Element "+(i+1)+" is: ");
				arr1[i]=sc.nextInt();
			}
			System.out.print("array 2 is :  ");
			System.out.println("elements : "+Arrays.toString(arr1));
			for(i=0;i<a;i++) {
				for(j=0;j<a1;j++) {
					if(arr[i]==arr1[j]) {
						System.out.print("both array are same!!!!");
						break;
					}else {
						System.out.print("both array are different!!!!");
						break;
					}
				}
			}
		}
	}
}
import java.util.Arrays;
import java.util.Scanner;
public class ARRAY_DUPLICATE_DISPLAY {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the array size:  ");
		int a=sc.nextInt(),i,j;
		int arr[]=new int[a];
		System.out.println("The Elements are :-");
		for(i=0;i<a;i++) {
			System.out.print("Element "+(i+1)+" is: ");
			arr[i]=sc.nextInt();
		}
		System.out.print("array 1 is :  ");
		System.out.println("elements : "+Arrays.toString(arr));
		for(i=0;i<arr.length;i++) {
			for(j=i+1;j<arr.length;j++) {
				if((arr[i] == arr[j])&& i != j)  {
                    System.out.println(arr[j]);  
				}  
			}
		}
	}
}
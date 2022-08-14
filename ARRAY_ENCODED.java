import java.util.Arrays;
import java.util.Scanner;
public class ARRAY_ENCODED{
	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		System.out.print("Enter the Range : ");
		int range = value.nextInt();
		int arr[] = new int[range];
		for(int i=0;i<range;i++) {
			System.out.print("Enter the Number "+(1+i)+" : ");
			arr[i]=value.nextInt();
		}  
		System.out.println("original array is : "+Arrays.toString(arr));
		System.out.println("First Element of the given number is : "+arr[0]);
		int sum=0;
		for(int i=0;i<range;i++) {
			sum = sum+arr[i];
		}
		System.out.println("sum of the given number is : "+sum);
		for(int i=0;i<arr.length;i++) {
			if(i==arr.length-1) {
				arr[i]=arr[i];
			}
			else {arr[i]=arr[i+1]-arr[i];
			}
		}
		System.out.println("The Encoded Array : "+Arrays.toString(arr));
	}
}
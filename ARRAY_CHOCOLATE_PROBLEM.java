import java.util.*;
public class ARRAY_CHOCOLATE_PROBLEM {
	public static void main(String[] args) {
		System.out.println("Enter the boys count: ");
		Scanner in=new Scanner(System.in);
		int boys=in.nextInt();
		System.out.println("Enter the chocolate packet count: ");
		int chocolate=in.nextInt();
		int arr[]= new int[chocolate];
		int i=0;
		for(i=0;i<=arr.length-1;i++) {
			System.out.println("Enter the count of "+(i+1)+" packet value: ");
			arr[i]=in.nextInt();
		}
		in.close();
		int count = 0;
		Arrays.sort(arr);
		for(i=0;i<=arr.length-boys;i++) {
			int min = arr[i+boys-1]-arr[i];
			count++;
		}  
		int arr2[] = new int[count];
		for(i=0;i<=arr.length-boys;i++) {
			count-=1;
			int min = arr[i+boys-1]-arr[i];
			System.out.println(min);
			arr2[count]=min;
		}
		System.out.println(Arrays.toString(arr2));
		Arrays.sort(arr2);
		System.out.println("Minimum value : "+arr2[0]);
	}
}
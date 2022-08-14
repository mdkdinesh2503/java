import java.util.Scanner;
public class HIGH_TRAPPING_RAIN {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of blocks:");
		int n=sc.nextInt();
		int []arr=new int[n];
		System.out.println("Enter the units of n blocks:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=1;i<arr.length-1;i++) {
			if(arr[0]>arr[i]) {
				sum=sum+arr[0]-arr[i];
			}
		}
		System.out.print("Total unit of water trapped is:"+" "+sum);
	}
}
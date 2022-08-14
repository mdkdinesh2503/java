import java.util.*;
public class ARRAY_DATE_PROBLEM {
	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		System.out.print("Enter the Date : ");
		int date = value.nextInt();
		System.out.println("Enter Number of Cars : ");
		int carCount = value.nextInt();
		System.out.println("the Number are: ");
		int carNumbers[] = new int[carCount];
		for(int i=0;i<carCount;i++) {
			carNumbers[i]=value.nextInt();
		}
		int fine=0;
		for(int i=0;i<carNumbers.length;i++) {
			if(date%2==0) {
				if(carNumbers[i]%2!=0) {
					fine =fine+250;
				}
			}
			if(date%2!=0) {
				if(carNumbers[i]%2==0) {
					fine =fine+250;
				}
			}
		}
		System.out.println("total fine: "+fine);
	}
}
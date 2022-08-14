import java.util.*;
public class MATRIX_READ_DISPLAY {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j,s=0,n=3;
		System.out.print("enter the size of row: ");
		int r=sc.nextInt();
		System.out.print("enter the size of column: ");
		int c=sc.nextInt();
		int arr[][]=new int[r][c];
		System.out.println("enter the matrix:- ");
		for(i=0;i<r;i++) {
			for(j=0;j<c;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Display the matrix:- ");
		for(i=0;i<r;i++) {
			for(j=0;j<c;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
	}
}
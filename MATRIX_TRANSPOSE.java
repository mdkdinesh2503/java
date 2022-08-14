import java.util.Scanner;

public class MATRIX_TRANSPOSE {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j,S=0,n=3;
		System.out.print("enter the size of row: ");
		int r=sc.nextInt();
		System.out.print("enter the size of column: ");
		int c=sc.nextInt();
		int arr[][]=new int[r][c];
		int s[][]=new int[r][c];
		System.out.println("enter the 1 matrix:- ");
		for(i=0;i<r;i++) {
			for(j=0;j<c;j++) {
				arr[i][j]=sc.nextInt();
				System.out.print(" ");
			}
			System.out.println("");
		}
		System.out.println("transpose of matrix ");
		for(i=0;i<r;i++) {
			for(j=0;j<c;j++) {
				s[i][j]=arr[j][i];
			}
		}
		for(i=0;i<r;i++) {
			for(j=0;j<c;j++) {
				System.out.print(s[i][j]+" ");
			}
			System.out.println("");
		}
	}
}
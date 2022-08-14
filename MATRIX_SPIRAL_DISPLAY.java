import java.util.*;
public class MATRIX_SPIRAL_DISPLAY {
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
		System.out.println("edit the matrix:- ");
		int top=0,bottom=arr.length-1;
		int left=0,right=arr[0].length-1;
		while(true) {
			if(left>right) {
				break;
			}
			for(i=left;i<=right;i++) {
				System.out.print(arr[top][i]+" ");
			}
			top++;
			if(top>bottom) {
				break;
			}
			for(i=top;i<=bottom;i++) {
				System.out.print(arr[i][right]+" ");
			}
			right--;
			if(left>right) {
				break;
			}
			for (i=right;i>=left;i--) {
				System.out.print(arr[bottom][i]+" ");
			}
			bottom--;
			if(top>bottom) {
				break;
			}
			for(i=bottom;i>=top;i--) {
				System.out.print(arr[i][left]+" ");
			}
			left++;
		}
	}
}
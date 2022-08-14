import java.util.*;
public class MATRIX_SNAKE_DISPLAY {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int row=sc.nextInt();
		System.out.print("Enter the number of columns : ");
		int column=sc.nextInt();
		int m[][]=new int[row][column];
		System.out.println("Enter the "+row*column+" elements for matrix : ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				m[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.print(m[i][j]+"  ");
			}
			System.out.println();
		}
		System.out.print("OUTPUT : ");
		for(int i=0;i<row;i++) {
			if(i%2==0) {
				for(int j=0;j<column;j++) {
					System.out.print(m[i][j]+"  ");
				}
			}
			else {
				for(int j=column-1;j>=0;j--) {
					System.out.print(m[i][j]+"  ");
				}
			}
		}
	}
}
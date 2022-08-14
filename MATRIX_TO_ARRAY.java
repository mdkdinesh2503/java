import java.util.*;
public class MATRIX_TO_ARRAY {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter row value: ");
		int r=sc.nextInt();
		System.out.print("enter column value: ");
		int c=sc.nextInt();
		int[][] arr = new int[r][c];
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int k=0;
		int nArr[] = new int[r*c];
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				int temp = arr[i][j];
				nArr[k] = temp;
				k++;
			}
		}
		Arrays.sort(nArr);
		System.out.println(Arrays.toString(nArr));
	}
}
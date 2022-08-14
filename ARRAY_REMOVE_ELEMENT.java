import java.util.*;
public class ARRAY_REMOVE_ELEMENT {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the array size:  ");
		int a=sc.nextInt(),i;
		int arr[]=new int[a];
		System.out.println("The Elements are :-");
		for(i=0;i<a;i++) {
			System.out.print("Element "+(i+1)+" is: ");
			arr[i]=sc.nextInt();
		}
		System.out.print("array 1 is :  ");
		System.out.println("elements : "+Arrays.toString(arr));
		System.out.println("Enter the removing element:  ");
		int p=sc.nextInt();
		 for( i = 0; i < a; i++){
			 for(int j = i; j < a - 1; j++){
				 if(arr[i] == p){
		            arr[j] = arr[j+1];
		            break;
				 }
		      }
		  }
		 for(i=0;i<a-1;i++) {
				System.out.println(arr[i]);
		}
	}
}
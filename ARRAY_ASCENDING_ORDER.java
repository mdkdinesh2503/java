import java.util.*;
public class ARRAY_ASCENDING_ORDER {
	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		System.out.print("Enter the Number range: ");
		int range = value.nextInt();
		int arr[] = new int[range];
		int i,j,temp;
		for(i=0;i<range;i++) {
			System.out.print("Enter the Number "+(1+i)+" : ");
			arr[i]=value.nextInt();
		}  
		System.out.println("original array is : "+Arrays.toString(arr));
	    for (i=0;i<arr.length;i++) {     
	    	for (j = i+1; j < arr.length; j++) {     
	    		if(arr[i] > arr[j]) {    
	                   temp = arr[i];    
	                   arr[i] = arr[j];    
	                   arr[j] = temp;    
	            }     
	        }     
	     }     
	     System.out.print("Ordered Array is: "+Arrays.toString(arr));
	}
}
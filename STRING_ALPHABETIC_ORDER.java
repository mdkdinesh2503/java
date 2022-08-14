import java.util.*;
public class STRING_ALPHABETIC_ORDER {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,a,j;
		String temp;
		System.out.print("Enter the array size:  ");
		a=sc.nextInt();
		String s[]=new String[a];
		System.out.println("Enter the string:-");
		for(i=0;i<a;i++) {
			s[i]=sc.next();
		}
		for(i=0;i<a;i++) {
			for(j=i+1;j<s.length;j++) {
				if(s[i].compareTo(s[j])>0){    
	                   temp = s[i];    
	                   s[i] = s[j];    
	                   s[j] = temp;    
	            }   
			}
		}
		System.out.print("Ordered Array is: "+Arrays.toString(s));
	}
}
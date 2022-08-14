import java.util.*;
public class STRING_BASED_ENCRIPTION {
	public static String output1;
	public static void main( String [] args ) {
		Scanner sc=new Scanner(System.in);
		int s=0,m=0;
		System.out.println("enter the string: ");
		String input1=sc.next();
		String temp=input1.toUpperCase();
		String key=input1.substring(input1.length()-1);
		System.out.println("the key is: "+key);
		char k_v=input1.charAt(input1.length()-1);
		for(char ch : temp.toCharArray()) {
			if(ch>='A'&&ch<='Z') {
				s+=1+ch-'A';
			}
		}
		System.out.println("the sum of given string: "+s);
		for(char ch : temp.toCharArray()) {
			if(ch==input1.charAt(input1.length()-1)) {
				m+=1+ch-'A';
			}
		}
		System.out.println("the sum of given string: "+m);
	}
}

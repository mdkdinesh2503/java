import java.util.Scanner;
public class HIGH_ASCII_SUM_PRIME {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the String:  ");
	    String s = sc.nextLine();
	    int i,c=0,sum=0;
	    char str[]=s.toCharArray();
	    int arr[]=new int[s.length()];
	    for(i=0;i<s.length();i++) {
	    	str[i]=s.charAt(i);
	    	 arr[i]=str[i];
	    }
	    for(i=0;i<s.length();i++) {
	    	 System.out.println("the ASCII value of "+str[i]+" is: "+arr[i]);
	    }
	    for(i=0;i<s.length();i++) {
	    	for( int j=2;j<arr[i];j++){
	        		if(arr[i]%j==0){
	        			c++;   
	        		}
	        }
	        if(c==0) {
	        	sum=sum+arr[i] ;
	        }else {
	        	c=0;
	        }
	    }
	    System.out.print("Sum is :"+sum);
	}
}
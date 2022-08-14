import java.util.*;
public class BASIC_PALINDROME_NO {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the Number:  ");
	      int s = sc.nextInt(),rev=0,m;
	      m=s;
	      while(s!=0) {
	    	  rev=(rev*10)+(s%10);
	    	  s=s/10;
	      }
	      if(m==rev) {
	    	  System.out.println(" PALINDROME!!");  
	      }else {
	    	  System.out.println(" NOT PALINDROME!!");
	      }
	}
}
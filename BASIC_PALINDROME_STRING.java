import java.util.*;
public class BASIC_PALINDROME_STRING {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the String:  ");
	      String s = sc.nextLine();
	      String rev="";
	      int i;
	      for(i=s.length()-1;i>=0;i--) {
	    	   rev=rev+s.charAt(i);
	      }
	      System.out.println(rev);
	      boolean palindrome=true;
	      for(i=0;i<s.length();i++) {
	    	  if(s.charAt(i)!=rev.charAt(i)) {
	    		  palindrome=false;
	    	  }
	      }
	      if(palindrome) {
	    	   System.out.println("PALINDROME!!!");
	      }else {
	    	   System.out.println("NON PALINDROME!!!");

	      }
	}
}
import java.util.*;
public class STRING_DIGITS_CHAR {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the String:  ");
	    String s = sc.nextLine();
	    int c=0;
	    char str[]=s.toCharArray();
	    for(int i=0;i<s.length();i++) {
	    	if(str[i]<='9') {
	    		c++;
	    	}
	    }
	    if(c==s.length()) {
	    	System.out.println("contains digits");
	    }else {
	    	System.out.println("contains digits or character");
	    }
	}
}
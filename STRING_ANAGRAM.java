import java.util.*;
public class STRING_ANAGRAM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the original String:  ");
	    String o = sc.nextLine();
	    System.out.println("Enter the alter String:  ");
	    String a = sc.nextLine();
	    boolean status=true;
	    if(o.length()==a.length()) {
	    	char str[]=o.toLowerCase().toCharArray();
	    	char str1[]=a.toLowerCase().toCharArray();
	    	Arrays.sort(str);  
            Arrays.sort(str1);  
            status = Arrays.equals(str, str1); 
	    }else {
			status=false;
		}
	    if(status) {
	    	System.out.println("the given string "+o+" and "+a+" is anagram!!");
	    }else {
	    	System.out.println("the given string "+o+" and "+a+" is not anagram!!");
	    }
	}
}
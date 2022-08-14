import java.util.*;
public class STRING_NON_REPEATING {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str = sc.nextLine();   
		System.out.println("The given string is: " + str);
		  for (int i = 0; i < str.length(); i++) {
		   boolean unique = true;
		   for (int j = 0; j < str.length(); j++) {
		    if (i != j && str.charAt(i) == str.charAt(j)) {
		     unique = false;
		     break;
		    }
		   }
		   if (unique) {
		    System.out.println("The first non repeated character in String is: " + str.charAt(i));
		    break;
		   }
		  }
	}
}
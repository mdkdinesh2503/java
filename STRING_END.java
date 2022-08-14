import java.util.*;
public class STRING_END {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the string:  ");
	    String s = sc.nextLine();
	    System.out.print("enter the end element:  ");
	    String e=sc.next();
	    String s1 = s.replaceAll("[x]", "");
	    String s2 = s.replaceAll("[^x]", "");
	    System.out.println(s1 + s2);
	}
}
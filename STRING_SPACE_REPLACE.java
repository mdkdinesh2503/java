import java.util.*;
public class STRING_SPACE_REPLACE {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the string:  ");
		String s=sc.nextLine();
		String h=s.replace(" ", "%20");
		System.out.print("After Converting:   "+h);
	}
}
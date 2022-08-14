import java.util.Scanner;

public class STRING_REVERSE {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the String:  ");
	      String s = sc.nextLine();
	      String rev="";
	      int i;
	      for(i=s.length()-1;i>=0;i--) {
	    	   rev=rev+s.charAt(i);
	      }
	      System.out.println("reverse of string :");
	      System.out.println(rev);

	}

}

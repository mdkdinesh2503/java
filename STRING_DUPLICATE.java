import java.util.Arrays;
import java.util.Scanner;
public class STRING_DUPLICATE {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str1=sc.nextLine();
		char str[]=str1.toCharArray();
		System.out.println("The duplicate Elements is :-");
		for(int i=0;i<str.length;i++) {
			for(int j=i+1;j<str.length;j++) {
				if((str[i] == str[j])&& i != j)  {
                    System.out.println(str[j]); 
                    break;
				}  
			}
		}
	}
}
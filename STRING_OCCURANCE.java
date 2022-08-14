import java.util.*;
public class STRING_OCCURANCE {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string:  ");
		String s=sc.nextLine();
		int c=0;
		char str[]=s.toLowerCase().toCharArray();
		char str1[]=s.toLowerCase().toCharArray();
		for(int i=0;i<s.length();i++) {
			if(str1[i] != '!') {
				c=1;
				for(int j=i+1;j<s.length();j++) {
					if(str[i]==str1[j]) {
						c++;
						str1[j] = '!'; 
					}
				}
			System.out.println("the given "+str1[i]+" occures "+c+" times!!!");
			}	
		}
	}
}
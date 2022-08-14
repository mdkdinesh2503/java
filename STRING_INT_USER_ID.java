import java.util.*;
public class STRING_INT_USER_ID {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your first name: ");
		String input1=sc.next();
		System.out.println("enter your last name: ");
		String input2 =sc.next();
		System.out.println("enter your pin code: ");
		int input3=sc.nextInt();
		System.out.println("enter position of code: ");
		int input4=sc.nextInt();
		String s_n="",l_n="";
		int k,d=0;
		// digits
		int w=input3;
		while(w!=0) {
			k=w%10;
			d++;
			w=w/10;
		}
		System.out.println("the digith of pin code is: "+d);
		//step1
		if(input1.length()>input2.length()){
			l_n=input1;
			s_n=input2;
		}else if(input2.length()>input1.length()){
			l_n=input2;
			s_n=input1;
		}else if(input2.length()==input1.length()) {
			s_n=input1;
			l_n=input2;
		}
		// last letter of smaller value
		String str[]=new String[20];
		for(int i=0;i<=s_n.length()-1;i++){
			str[i]=s_n.substring(i);
		}
		int r=s_n.length()-1;
		System.out.println("last letter of smaller name: "+str[r]);
		StringBuffer n=new StringBuffer(str[r]);
		for(int i = 0; i < str[r].length(); i++) {      
			if(Character.isLowerCase(str[r].charAt(i))) {        
				n.setCharAt(i, Character.toUpperCase(str[r].charAt(i)));    
			}else if(Character.isUpperCase(str[r].charAt(i))) {      
				n.setCharAt(i, Character.toLowerCase(str[r].charAt(i)));    
			}    
		}
		//input4 : left to right position
		String temp = Integer.toString(input3);
		int arr[]=new int[d];
		int j=input3;
		for (int i = 0; i < temp.length(); i++)
		{
			arr[i] = temp.charAt(i) - '0';
		}
		//input4 : right to left position
		int arr1[]=new int[d];
		int h=input3;
		for(int i=0;i<=d-1;i++) {
			arr1[i]=h%10;
			h=h/10;
		}

		System.out.println("larger name is: "+l_n);
		System.out.println("right to left(input3) in "+input4+" position : "+arr1[input4-1]);
		//original user ID
		StringBuffer newStr=new StringBuffer(l_n);
		for(int i = 0; i < l_n.length(); i++) {      
			if(Character.isLowerCase(l_n.charAt(i))) {        
				newStr.setCharAt(i, Character.toUpperCase(l_n.charAt(i)));    
			}else if(Character.isUpperCase(l_n.charAt(i))) {      
				newStr.setCharAt(i, Character.toLowerCase(l_n.charAt(i)));    
			}    
		}  
		System.out.println("normal user id :  "+n+newStr+arr[input4-1]+arr1[input4-1]);
	}
}
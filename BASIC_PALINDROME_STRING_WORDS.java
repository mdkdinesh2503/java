import java.util.*;
class PALINDROME_STRING_WORDS{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("INPUT:\t");
		String str;
		int count=0;
		str=sc.nextLine();
		str=str.replace("."," ");
		str=str.replace("?"," ");
		str=str.replace("!"," ");
		String answer="", ar[]= str.split(" ");
		for(int i=0;i < ar.length;i++){
			if(isPalindrome(ar[i])){
				count++;
				answer += ar[i] + " ";
			}
		}
		System.out.println("OUTPUT:\t\t"+answer+"\nNUMBER OF PALINDROMIC WORDS: "+count);
	}
	public static boolean isPalindrome(String str){
		char ch;
		int len=str.length(),half=len/2;
		for(int i=0;i < half;i++){
			if(str.charAt(i)!=str.charAt(len-i-1)) return false;
		}
		return true;
	}
}
import java.util.*;
public class HIGH_FANCY_NUMBER {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the mobile number : ");
		Long num=sc.nextLong();
		String s=Long.toString(num);
		char []ch=s.toCharArray();
		int com=0;
		int count1=0;
		for(int i=0;i<ch.length;i++) {
			if(i<=ch.length-3) {
				if(ch[i]==ch[i+1]&&ch[i]==ch[i+2]) {
					count1++;
				}
			}
		}
		if(count1==1) {
			System.out.println("It has consecutive numbers");
			com++;
		}
		for(int i=0;i<ch.length;i++) {
			if(i<=ch.length-3) {
				if(ch[i+1]==ch[i]+1&&ch[i+2]==ch[i]+2) {
					System.out.println("It has number in increasing order");
					com++;
					break;
				}
				else if(ch[i+1]==ch[i]-1&&ch[i+2]==ch[i]-2) {
					System.out.println("It has number in decreasing order");
					com++;
					break;
				}
			}
		}
		for(int i=0;i<ch.length;i++) {
			int count=0;
			for(int j=i;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					count++;
				}
			}
			if(count>=4) {
				System.out.println(ch[i]+" occurs "+count+" times");
				com++;
				break;
			}
		}
		if(com!=0) {
			System.out.println("---------RESULT--------\nIts a fancy number.");
		}
		else {
			System.out.println("---------RESULT--------\nnot a fancy number.");
		}
	}
}
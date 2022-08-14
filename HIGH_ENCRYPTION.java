import java.util.*;
public class HIGH_ENCRYPTION {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the text : ");
		String txt=sc.nextLine();
		char []ch=txt.toCharArray();
		System.out.print("Enter the key value : ");
		int key=sc.nextInt();
		System.out.print("Encrypted message : ");
		for(int i=0;i<ch.length;i++) {
			int ascii;
			if(Character.isUpperCase(ch[i])) {
				ascii=ch[i];
				int lastcap='Z';
				int ascii1=ascii+key;
				if(ascii1>lastcap) {
					int equ=lastcap-ascii;
					int key1=key-equ;
					ascii='A'+(key1-1);
				}
				else {
					ascii=ch[i]+key;
				}
			}
			else if(Character.isLowerCase(ch[i])) {
				ascii=ch[i];
				int lastlow='z';
				int ascii1=ascii+key;
				if(ascii1>lastlow) {
					int equ=lastlow-ascii;
					int key1=key-equ;
					ascii='a'+(key1-1);
				}
				else {
					ascii=ch[i]+key;
				}
			}
			else if(Character.isDigit(ch[i])) {
				ascii=ch[i];
				int lastdigi='9';
				int ascii1=ascii+key;
				if(ascii1>lastdigi) {
					int equ=lastdigi-ascii;
					int key1=key-equ;
					ascii='0'+(key1-1);
				}
				else {
					ascii=ch[i]+key;
				}
			}
			else {
				ascii=ch[i];
			} 
			System.out.print((char)ascii);
		}
	}
}
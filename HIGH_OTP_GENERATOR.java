import java.util.*;
public class HIGH_OTP_GENERATOR {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Account holder name is : ");
		String name=sc.nextLine();
		System.out.print("Account number is : ");
		long num=sc.nextLong();
		String y=Long.toString(num);
		String p=y.substring(0,5);
		long n=Long.valueOf(p);
		String p1=y.substring(5,y.length()-1);
		long n1=Long.valueOf(p1);
		String s=Long.toString(num);
		char []ch=s.toCharArray();
		int i,sh=0,sum=0;
		char kk=' ';
		if(ch.length==11) {
			System.out.print("Account type(Savings /Current /Loan) is : ");
			String type=sc.next();
			String otp1=type.substring(0,1);
			String otp2=type.substring(1,2);
			String otp3=s.substring(0,1);
			while(n/10!=0) {
				sum=0;
				while(n!=0) {
					long r=n%10;
					sum+=r;
					n/=10;
				}
				n=sum;
			}
			String otp4=Integer.toString(sum);
			String otp5=name.substring(0,1);
			while(n1/10!=0) {
				sh=0;
				while(n1!=0) {
					long r=n1%10;
					sh+=r;
					n1/=10;
				}
				n1=sh;
			}
			String otp6=Integer.toString(sh);
			String otp7=name.substring(name.length()-1);
			for(i=0;i<ch.length;i++) {
				kk=ch[ch.length-1];
			}
			String otp8=Character.toString(kk);
			String otp=otp1+otp2+otp3+otp4+otp5+otp6+otp7+otp8;
			System.out.println(otp);
		}else {
			System.out.println("Account number digit is INVALID!!!");
		}
	}
}
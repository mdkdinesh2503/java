import java.util.*;
public class HIGH_WIFI_PIN {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the roomno : ");
		int roomno=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the guest's lastname : ");
		String lastname=sc.nextLine();
		int unit=(roomno/10)%10;
		String tens=lastname.substring(lastname.length()-1);
		char [] spc= {')','!','@','#','$','%','^','&','*','('};
		char hun=' ';
		for(int i=0;i<spc.length;i++) {
			if(unit==i) {
				hun=spc[i];
			}
		}
		int temp=roomno;
		int sum=0;
		while(temp>0) {
			sum+=(temp%10);
			temp/=10;
		}
		int sum1=0;
		int sum2=0;
		if(sum>9) {
			while(sum>0) {
				sum1+=(sum%10);
				sum/=10;
			}
			sum=sum1;
			if(sum>9) {
				while(sum>0) {
					sum2+=(sum%10);
					sum/=10;
				}
				sum=sum2;
			}
		}
		else {
			sum=sum;
		}
		if(sum==1) {
			sum=2;
		}
		if(sum%2!=0) {
			sum=sum-1;
		}
		else {
			sum=sum;
		}
		String wifi=(sum)+""+(hun)+""+(tens)+""+(unit);
		System.out.print("WIFI-PIN : "+wifi);
		sc.close();
	}
}
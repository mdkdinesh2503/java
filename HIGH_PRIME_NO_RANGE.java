import java.util.Scanner;
public class HIGH_PRIME_NO_RANGE {
	public static void main(String[] args) {
		int i,count;
        System.out.print("Enter from limit : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("Enter to limit : ");
        int n1=sc.nextInt();
        System.out.println("Prime numbers between 1 to "+n+" are ");
        for( i=n;i<=n1;i++){
        	count=0;
        	for(int j=1;j<=i;j++){
        		if(i%j==0){
        			count++;   //count=count+1     
        		}
        	}
        	if(count==2) {
        		System.out.print(i+"  "); 
        	}
        }
	}
}
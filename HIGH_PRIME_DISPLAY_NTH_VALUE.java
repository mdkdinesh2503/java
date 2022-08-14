import java.util.*;
public class HIGH_PRIME_DISPLAY_NTH_VALUE {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.print("the nth prime number: ");
	    int nth = sc.nextInt(); 
	    int n=1, c=0,i;
	    while(c < nth){
	    	n++;
	    	for ( i = 2; i <= n; i++){ 
	    		if (n % i == 0) {
	    			break;
	    		}
	    	}
	    	if ( i == n){
	    		c++;
	    	}
	    }
	    System.out.println("Value of nth prime: " + n);
	}
}
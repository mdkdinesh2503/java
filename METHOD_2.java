import java.util.*;
public class METHOD_2 {
	static double BMI(double w,double h) {
		return (w/(h*h))*703;
	}
	public static double patients(double w,double h) {
		return (w/(h*h))*703;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the patient name: ");
		String s=sc.nextLine();
		System.out.print("patients vital status: ");
		System.out.println(patients(10.2,20)); 
		System.out.print("enter the another patient name: ");
		String st=sc.nextLine();
		System.out.print("patients vital status: ");
		System.out.println(BMI(7.2,2.0)); 
	}
}
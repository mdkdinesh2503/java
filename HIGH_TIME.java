import java.util.*;
public class HIGH_TIME {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter four number to find maximum time_ _ _ _ _");
		int arr[]=new int[4];
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter the value for index "+i+" : ");
			arr[i]=sc.nextInt();
		}
		System.out.println("--------OUTPUT-------\n"+time(arr));
	}
	public static String time(int arr[]) {
		String result="";
		boolean flag;
		flag=false;
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				for(int k=0;k<4;k++) {
					if(i==j||j==k||k==i) {
						continue;
					}
					else {
						String hh=arr[i]+""+arr[j];
						String mm=arr[k]+""+arr[6-i-j-k];
						String time=hh+":"+mm;
						if(hh.compareTo("24")<0&&mm.compareTo("60")<0&&time.compareTo(result)>0) {
							result=time;
							flag=true;
						}
					}
				}
			}
		}
		if(!flag) {
			return "-1";
		}
		else {
		return result;
		}
	}
}
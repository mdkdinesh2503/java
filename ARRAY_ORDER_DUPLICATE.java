import java.util.*;
public class ARRAY_ORDER_DUPLICATE {
	public static void main(String[] args) {
		System.out.print("enter the range:");
		Scanner v=new Scanner(System.in);
		int range=v.nextInt();
		int number =1;
		int arr[]=new int[range];
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("the number "+(number+i)+" :");
			arr[i]=v.nextInt();
		}
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("ascending order:"+Arrays.toString(arr));
		int arr2[]=new int[arr.length];
		for(int i=0;i<arr.length;i++){
			int count=0;
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]==arr[j])
					{
						count++;
					}
				}
				if(count==0)
				{
					arr2[i]=arr[i];
				}
		}
		int len=0;
		for(int i=0;i<arr.length;i++) {
			if(arr2[i]!=0)
			{
				len++;
			}
		}
		int arr3[]=new int[len];
		for(int i=0,j=0;i<arr.length;i++) {
			if(arr2[i]!=0) {
				arr3[j]=arr2[i];
				j++;
			}
		}
		System.out.println("dupilcate array:"+Arrays.toString(arr3));
	}
}
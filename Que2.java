import java.util.Scanner;
public class Que2 {
static	Scanner sc=new Scanner(System.in);
public static void acceptRecord(int[]arr)
{
	System.out.println("Enter the array:	");
		for(int i=0;i<arr.length;i++)
		{		
			arr[i] = sc.nextInt();
		}
}
public static void printRecord(int[]arr)
{
	int avg;
	   for(int i=0;i<(arr.length-2);i++)
	   {
	       avg=(arr[i]+arr[i+1]+arr[i+2])/3;
	       System.out.print(avg+" ");
	   }
}

	public static void main(String[] args) {
		System.out.print("Enter size of array: ");
		int n=sc.nextInt();
		int []arr=new int[n];
		Que2.acceptRecord(arr);
		Que2.printRecord(arr);

	}

}

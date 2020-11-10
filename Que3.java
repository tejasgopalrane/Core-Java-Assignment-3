import java.util.Scanner;
public class Que3 {
public static void printRecord(int n)
{
	int sum=0;
	for(int i=1;i<=n;i++)
	{ 
		int b=1;
		sum=sum+b;
		if(sum%2==0)
			System.out.print(sum*sum+" ");
		else
			System.out.print(sum*sum*sum+" ");
		
	}
}
	public static void main(String[] args) {
		System.out.print("Enter N^th term:	");
	Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Que3.printRecord(n);
	}
	
	}



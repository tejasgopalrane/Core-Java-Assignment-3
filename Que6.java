
public class Que6 {

	public static void main(String[] args) {
		int a[] = {24,54,31,16,82,45,67};
	    int m1=Integer.MIN_VALUE; 
	    int m2=Integer.MIN_VALUE;
	    int m3=Integer.MIN_VALUE;
	    for(int i=0;i<a.length;i++)
	    {
	        if(a[i] > m1)
	        {
	            m3 = m2;
	            m2 = m1; 
	            m1 = a[i];
	        }
	        else if (a[i] > m2)
	        {
	            m3 = m2; 
	            m2 = a[i];
	        }
	        else if  (a[i] > m3)
	        {
	            m3 = a[i];
	        }
	    }
	    //System.out.println("Largest Element in array:	"+m1);
	    //System.out.println("Second-Largest Element in array:	"+m2);
	    System.out.println("Third-Largest Element in array:	"+m3);
	}

}

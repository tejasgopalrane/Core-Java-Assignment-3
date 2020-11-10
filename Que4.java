
public class Que4 {

	public static void main(String[] args) {
		int arr1[]={5,4,3,2,1};
	    
	    int a=1,b=1;
	   for(int i=0;i<arr1.length-2;i++)
	   {
	      if(arr1[i]<arr1[i+1])
	    	  b = 0;
	       else if(arr1[i]>arr1[i+1])
	    	   a = 0;
	        //else
	         //System.out.println("random");
	   }
	   if (a == 1)
		   System.out.println("The array is in ascending order");
		  else if (b == 1)
			  System.out.println("The array is in descending order");
		  else
			  System.out.println("Array is random");
	}

}

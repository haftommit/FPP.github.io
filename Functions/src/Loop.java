
public class Loop {
	public static int sumN(int n) {
	
			int sum =0; 
			while(n>0)
				{
					sum = (n*(n + 1))/2;
				}
			return sum;
		}
	public static void printArrayInt(int[] mylist) {
		for(int i=0; i<mylist.length; i++)
			{
				System.out.print(mylist[i] + ", ");
			}
	}
	public static void printArrayString(String[] str) {
			for(int i=0; i<str.length; i++)
				{
					System.out.print(str[i] + ", ");
				}
		}
	public static int largest(int[] a) {
			int min = 0, max = 0;
			for (int i = 1; i < a.length; i++) 
			{
				if (a[i] > max) 
				{
					max = a[i];
					min = max;
				}
			}
			
			return max;
		}
	public static int isInfinite(int[] a){
		int rt = 0;
		for (int i=0; i<a.length; i++){

			if (a[0] == -1 ) {
				rt = -1;
				break;
			}
			else if ( a[0] < -1 || a[0] >= a.length){

				rt = 1;
				break ;
			}
			else 
			
			a[0] = a[a[0]];
			
			}
		return rt;
	}
	public static int isCumulative(int[ ] a)
	{
			int sum = a[0], rt =0;
			
			if (a.length<=1)
				  return rt;
			else 
			{
				for(int i=1; i < a.length; i++)
				{
					if(a[i] == sum)
					{
						sum += a[i];
						rt = 1;
					}
					else
					{
						rt =0;
						break;
					}
				}
			}
			return rt;
	}
	public static int loopSum(int[ ] a, int n){
		int sum = 0;
		if(n < a.length){
			for(int i=0; i<n; i++)
				sum += a[i];
			}
		else {
			int loop = n, k=a.length;
			while(loop > 0){
				for (int i=0; i<k; i++){
					sum +=a[i];
				}
				loop = loop - a.length;
				
				if(loop < a.length)
					k=loop;
			}	
		}
		return sum;
	}
	public static int isPrime(int n){
		int rt = 1;
		int sqrt = (int) Math.sqrt(n) + 1;
		for (int i = 2; i < sqrt; i++) {
            if (n % i == 0) 
                // number is perfectly divisible - no prime
                rt = 0;  
            }
		return rt;
	}
	public static int hasNFollowingComposites(int n, int count){
			int counter = 0;
			int rt = 1;
			
			if(isPrime(n) == 1)
			
				return rt;
	        
	        else{
	        	for(int i = n+1; i <= n+count; i++){
	        		int result = isPrime(i);
	        		if (result == 1)
	        				rt = 1;
	        		else 
	        			rt = 0;
	        	}
	        	return rt;
	}
	}
	public static int equivalentArrays(int[] a, int[] b)
	{
			int count = 0;
			int addup = 0;
			int rt = 0;
			if(a.length == 0 || b.length == 0)
				return rt;
			else if(a.length != b.length)
				return rt;
			else if(a.length == b.length)
			{
				for(int i=0; i < a.length; i++)
				{
					for(int j=0; j < b.length; j++)
					{
						if(a[i] == b[j])
							count++;
					}
					
					addup = addup + count;
					if(addup < a.length && addup == count)
					rt = 0;
						break;
				}
			}
			return rt;
	}
	public static int hasTwoValues(int[] a )
	{
		int rt = 1;
		int count =0;
			if(a.length == 0)
			{
				rt = 0;
			}
			else{
				for(int i=0; i<a.length; i++)
				{
					for(int j=0; j<a.length; j++)
					{
						if(a[i] != a[j])
						count++;
					}
					if(count > 3)
					{
						rt = 0;
						break;
					}
				}
			}
		return rt;
	}
	public static int isSorted( int[] a)
	{
		int rt =1, assending =0, decending =0;
		for(int i = 0; i < a.length-1; i++)
		{
			if(a[i] < a[i+1])
			{
				assending++;
				System.out.println("assending" + assending);
			}
			else if(a[i] > a[i+1])
			{
				decending++;
				System.out.println("decending" + decending);
			}
		}
		if((assending == a.length-1) || (decending == a.length-1))
		 rt =1;
		else 
			rt = 0;
		
		return rt;
	}
	public static int oddEven(int[] a)
	{
		int rt = 0;
		int even =0, odd =0;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2 == 0)
				even += even + a[i];
			else
				odd += odd + a[i];
		}
		rt = odd - even;
		return rt;
	}
	public static int secondLargest(int[] a)  
	{
		    int max1 = -1;
		    int max2 = -1;
				
		    for (int i=0; i<a.length; i++)
		    {
		      if (a[i] > max1)
		      {
		        max2 = max1;
		        max1 = a[i];
		      }
		      else if (a[i] != max1 && a[i] > max2)
		        max2 = a[i];
		    }
				
		    return max2;
	}

	public static void main(String[] args) {
		//int[] infinite = {-3, -3, 6, 12, 24};
		int[] infinite = {1, 2, 3};
		int result = isInfinite(infinite);
		//int commulative = isCumulative(infinite);
		//System.out.println("Commulative is " + commulative);
		System.out.println("Result is " + result);
		int[] sendArgs = {1, 2, 3};
		int loop = loopSum(sendArgs, 3 );
		System.out.println("Loop sum  is " + loop);
		
		System.out.println(hasNFollowingComposites(23, 6));
		System.out.println("Testing Result");
		System.out.println(secondLargest(infinite));
		
	}
		
		/**int[] myList = {9, 29, 34, 35};

	     	 	// Print all the int array elements
	      	printArrayInt(myList);
	      		
	      		// Summing all elements (1 ... n)
	      	int total = sumN(5);
	      	System.out.println("Total is " + total);
	      	
	      		// Finding the largest element
			int max = largest(myList);
			System.out.println("Max is " + max);
				// Print all the String array elements
			String[] str = {"Bob", "Steve", "Sue ", "Tony ", "Melba "};
			printArrayString(str);
			
			
		*/
}


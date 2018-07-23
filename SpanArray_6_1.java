package practice;

public class SpanArray 
{
	static int max = 0;
	static int[] arr1 = {1, 2, 1, 1, 3};
	static int[] arr2 = {1, 4, 2, 1, 4, 1, 4};
	static int[] arr3 = {1, 4, 2, 1, 4, 4, 4};
	
	public static void main(String[] args) 
	{
		System.out.println(span(arr1));
		System.out.println(span(arr2));
		System.out.println(span(arr3));
	}
	
	 public static int span(int[] nums)
	 {
	    
	    for(int i = 0; i < nums.length; i++) 
	    {
	        int j = nums.length - 1;
	              
	        if(nums[i] != nums[j])
	            j--;
	                              
	        int span = j - i + 1;
	                                      
	        if(span > max)
	            max = span;
	    }
	    return max;
	        
	 }
	  
	

}

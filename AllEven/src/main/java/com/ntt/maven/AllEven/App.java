package com.ntt.maven.AllEven;

public class App 
{
	public static void isAllEven () {
	 	 int[] allEven = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21};
	 	 
	 	 for (int i = 0; i < allEven.length; i++) {
	 		 if (allEven[i] % 2 == 0) {
	 			 System.out.println("Yes, the current parameter "+i+" is even.");
	 		 }
	 		 else {
	 			 System.out.println("No, the current paramter "+i+" is not even.");
	 		 }
	 	 }
	 	 
	    }
    public static void main( String[] args )
    {
        isAllEven();
    }
}

public class SwapNum
    {
      public static void main(String[] args)
        {  
	// Swapping of two variables without third variable (possible with Int,float datatype)
          int num1= 10;
          int num2= 20;
	  System.out.println("Num1 and Num2 before swap   =  " +num1+ "  ,  " +num2);	
          num1=num1+num2;
          num2=num1-num2;
          num1=num1-num2;
          System.out.println("Num1 and Num2 afetr swap   =  " +num1+ "  ,  " +num2);
        }
    }

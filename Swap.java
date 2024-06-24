public class Swap
    {
      public static void main(String[] args)
        {  
		// Swapping of two variables with the help of third variable 
          String name ="Adnan";
          String lstname="Siddiqui";
	  System.out.println("Name and Lastname before swap   =  " +name+ "  ,  " +lstname);	
          String temp;
          temp = name;
          name = lstname;
          lstname = temp;
          System.out.println("Name and Lastname after swap   =  " +name+ "  ,  " +lstname);
        }
    }

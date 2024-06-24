public class Swap
    {
      public static void main(String[] args)
        {  
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
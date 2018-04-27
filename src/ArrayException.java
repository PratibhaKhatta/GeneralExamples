
public class ArrayException 
{
    
    public static void main(String args[])
    {
    	 int array[]={10,60,50,40};
    
        try 
       {
    	  System.out.println(array[4]);
       }
        catch(ArrayIndexOutOfBoundsException e)
        {
        	System.out.println("size of array is 3");
        }
    }
}

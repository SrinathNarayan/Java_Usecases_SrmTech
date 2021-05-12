package lab2;


import java.util.Scanner;
import java.util.logging.Logger;

public class RemoveElements {
    static Logger log = Logger.getLogger(RemoveElements.class.getName());
	public static void main(String[] args)
    {
        String originalstring;
        Scanner in =new Scanner(System.in);
       log.info("Enter the string");
        originalstring = in.nextLine();
       log.info("Original string is >>  "+ originalstring);
       log.info("");
       log.info("Please enter unwanted characters as String");
       log.info("");
       
        String removecharacterstring=in.nextLine();
        String output=removeSpecificChars(originalstring, removecharacterstring);
       log.info("");
        
       log.info("Output is >>  " );
       log.info(output);
        in.close();
    }
    
    public static String removeSpecificChars(String originalstring ,String removecharacterstring)
    {
        char[] orgchararray=originalstring.toCharArray();
        char[] removechararray=removecharacterstring.toCharArray();
        int start;
        int end=0;
        
        
        boolean[]  tempBoolean = new boolean[128];
        
        
        for(start=0;start < removechararray.length;++start)
        {
            tempBoolean[removechararray[start]]=true;
        }
        
        
        for(start=0;start < orgchararray.length;++start)
        {
            if(!tempBoolean[orgchararray[start]])
            {
                orgchararray[end++]=orgchararray[start];
            }
        }
        
        
        return new String(orgchararray,0,end);
    }
 




}

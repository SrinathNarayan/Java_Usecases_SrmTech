package lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Logger;

public class ReverseArrayList {
    static Logger log = Logger.getLogger(ReverseArrayList.class.getName());
	public static void main(String[] args) 
    {
              
        ArrayList<String> arrlist = new ArrayList<>(); 
 
         
        arrlist.add("JAVA");         
        arrlist.add("ANDROID");        
        arrlist.add("ANGULAR");
        arrlist.add("C++");
        arrlist.add("JAVASCRIPT");         
        arrlist.add("HTML");
                 
                
       log.info("Before Reverse ArrayList:");         
       log.info( ""+arrlist);
         
              
        Collections.reverse(arrlist);
         
             
       log.info("After Reverse ArrayList:");         
       log.info("" +arrlist);
    }
}

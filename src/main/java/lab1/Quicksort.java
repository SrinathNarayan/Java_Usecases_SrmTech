package lab1;

import java.util.Scanner;
import java.util.logging.Logger;

public class Quicksort {
	 static int a[]; 
     static int n; 
     static Logger log = Logger.getLogger(Quicksort.class.getName());
   public static void main(String args[]) 
{ 
     Scanner read=new Scanner(System.in); 
    log.info("Enter Number of Elements You Want to Insert : "); 
     n=read.nextInt(); 
     a=new int[n]; 
     for(int i=0;i<n;i++) 
        { 
         log.info("\nEnter no."+(i+1)+" :"); 
          a[i]=read.nextInt(); 
        } 
     Quicksort ii=new Quicksort(); 
          ii.QuickSort(a,0,n-1); 
         log.info("\nAll Elements are :"); 
          for(int i=0;i<n;i++) 
             { 
                 log.info(a[i]+" "); 
             } 
             read.close();
} 
   void QuickSort(int a[],int first,int last) 
        { 
            int i,j,k,temp; 
            if(first<last) 
              { 
                   i=first; 
                   j=last+1; 
                   k=first; 
                    do 
                      { 
                        do 
                          { 
                             i++; 
                           }while(a[i]<a[k]); 
                               do 
                                { 
                                   j--; 
                                 }while(a[j]>a[k]); 
                                  if(i <j) 
                                    { 
                                      temp=a[i]; 
                                      a[i]=a[j]; 
                                      a[j]=temp; 
                                     } 
                      }while(i<j); 
                       temp=a[k]; 
                       a[k]=a[j]; 
                       a[j] =temp; 
                       QuickSort(a,first,j-1); 
                       QuickSort(a,j+1,last); 
               } 
        } 

}

import java.io.*;
public class CopyFile1
 {

   public static void main(String args[]) throws IOException 
     {  
      
       FileInputStream in = new FileInputStream("abm.txt");
       FileOutputStream out = new FileOutputStream("output.txt");
         
         int c;
	     
         while ((c = in.read()) != -1) 
         {
            out.write(c);
         }
		
      }
   }

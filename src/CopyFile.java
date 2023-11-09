import java.io.*;
public class CopyFile {

   public static void main(String args[]) throws IOException {  
      
       FileInputStream in = new FileInputStream("abm.txt");
       FileOutputStream out = new FileOutputStream("output.txt");
         
         int c;
//	    int k=0;
         while ((c = in.read()) != -1)
            {
              out.write(c);
//			System.out.print(c + "=");
//			System.out.println((char)c);
//			k++;
			
         }
		 System.out.println();
      //System.out.println(k);
      }
   }

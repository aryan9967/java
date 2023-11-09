import java.io.*;
 

public class GFG {
 
   
    public static void main(String[] args) throws Exception
    {
 
        
        File file = new File("C:\\Users\\Lenovo\\Desktop\\java programs\\IO Streams\\abk.txt");
 
        
 
        
        BufferedReader br= new BufferedReader(new FileReader(file));
 
        
        String st;
       
        while ((st = br.readLine()) != null)
 
            
            System.out.println(st);
    }
}
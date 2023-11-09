// Java Program to Illustrate reading from
// FileReader using FileReader class


import java.io.*;


public class GFG1 {

	
	public static void main(String[] args) throws Exception
	{

		
		FileReader fr = new FileReader("C:\\Users\\Lab1004\\Desktop\\Java\\IO Streams\\abk.txt");

		
		int i;
		
		while ((i = fr.read()) != -1)

			// Print all the content of a file
			System.out.print((char)i);
	}
}

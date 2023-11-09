import java. io. *;
class ReadTest
{
  public static void main(String[] args)throws IOException
      
    {
      File fl = new File("abm.txt");
      BufferedReader br = new BufferedReader(new FileReader(fl)) ;
      String str;
	  int k=0;
      while ((str=br.readLine())!=null)
      {
		  k++;
        System.out.println(str);
      }
      System.out.println(k);
      
    }    
  }

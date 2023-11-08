public class exception_handling {
    public static void main(String[] args) {
        try{
            int []arr=new int[3];
            arr[3]=5;
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally{
            System.out.println("finally block will always be executed");
        }
    }
}

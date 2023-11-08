import java.util.*;

public class vectors {
    public static void main(String []args)
    {
        Vector v=new Vector();
        v.ensureCapacity(20);
        v.add(5);
        v.add("hi");
        System.out.println(v);
        v.add(0, "java");
        System.out.println(v);

        ArrayList arr=new ArrayList();
        arr.add(5);
        arr.add("hii");
        arr.add("i am learning java");

        v.addAll(arr);
        System.out.println(v);

        Vector v2=new Vector();

        v2= (Vector) v.clone();
        System.out.println("v: "+v);
        System.out.println("v2: "+v2);

        if(v.contains("hi")) {
            System.out.println("v contains hi");
        }
        else{
            System.out.println("v does not contain hi");
        }

        System.out.println("hi"+ v.get(5));
        System.out.println(v.indexOf("i am learning java"));
        System.out.println(v.isEmpty());
        v.clear();
        v2.clear();
        System.out.println(v.isEmpty());
        System.out.println("v2: "+v2);
        System.out.println("v: "+v);
    }
}

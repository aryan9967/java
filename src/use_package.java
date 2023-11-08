import calculator.*;
import java.util.*;

public class use_package {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        calculator calc=new calculator();
        int choice;
        System.out.println("enter Two integers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("enter your choice\n 1)Addition\n 2) Subtraction\n 3) Multiplication\n 4) Division");
        choice=sc.nextInt();

        switch (choice){
            case 1:
                calc.add(a, b);
                break;
            case 2:
                calc.subtract(a,b);
                break;
            case 3:
                calc.multiply(a,b);
                break;
            case 4:
                calc.division(a,b);
                break;
            default:
                System.out.println("invalid choice");
        }
    }
}

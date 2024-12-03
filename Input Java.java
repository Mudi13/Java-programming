//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// Main class
import java.util.Scanner;
class Test
{
    public static void main(String [] arg)
    {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String s= sc.nextLine();
        System.out.println("Enter your age: ");
        int x = sc.nextInt();
        System.out.println("Enter Your Score:");
        float f = sc.nextFloat();

        System.out.println("name is:  "+s);
        System.out.println("Age: "+x);
        System.out.println("Score: "+f);
    }
}
package CoreJava;
import java.util.Scanner;
public class RelationalOp {
public static void main(String[] args) {
 //creating Scanner class to take input from user
 Scanner sc = new Scanner(System.in);
 //getting input value from the user
 System.out.println("Enter First Number : ");
 int num1 = sc.nextInt();
 System.out.println("Enter Second number : ");
 int num2 = sc.nextInt();
 System.out.println("Enter Third Number : ");
 int num3 = sc.nextInt();
 //Performing equal to operator
 System.out.println(" num1==num2&&num2==num3 : "+ (num1==num2&&num2==num3));
 // Is not Equal to
 System.out.println(" num1!=num2&&num2!=num3 : "+ (num1!=num2&&num2!=num3));
 //Performing greater than Operation
 System.out.println(" num1>num2&&num2>num3 : "+ (num1>num2&&num2>num3));
 //Performing less than Operation
 System.out.println(" num1<num2&&num2<num3 : "+ (num1<num2&&num2<num3));
 //Performing Greater than or Equal to
 System.out.println(" num1>=num2&&num2>=num3 : "+ (num1>=num2&&num2>=num3));
 //Performing less than or Equal to
System.out.println(" num1<=num2&&num2<=num3 : "+ (num1<=num2&&num2<=num3));
}
}


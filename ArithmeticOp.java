package CoreJava;
import java.util.Scanner;
public class ArithmeticOp {
public static void main(String[] args) {
//creating Scanner object to take input from user
Scanner sc = new Scanner(System.in);
//getting input value from user
System.out.println("Enter First Number : ");
int num1 = sc.nextInt();
System.out.println("Enter Second Number : ");
int num2 = sc.nextInt();
System.out.println("Enter Third Number : ");
int num3 = sc.nextInt();
//Arithmetic Operation
int add,sub,mul,div,mod;
add = num1 + num2 + num3;
sub = num1- num2-num3;
mul = num1*num2*num3;
div = num1/num2/num3;
mod = num1%num2%num3;
//Getting Results
System.out.println("Addition of Three Numbers : " +add);
System.out.println("Substraction of Three Numbers : " +sub);
System.out.println("Multiplication of Three Numbers : " +mul);
System.out.println("Division of Three Numbers : " +div);
System.out.println("Modulus of Three Numbers : " +mod);
}
}

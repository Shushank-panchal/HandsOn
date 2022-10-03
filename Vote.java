//WAP to test whether the person is applicable to give vote using If-Else
package CoreJava;
import java.util.Scanner;
class Vote {
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
//Enter the age of a person
System.out.println("Enter your Age : ");
int age = sc.nextInt();
//check Whether the person age is greater than 18 or not
if (age>=18)
{
	System.out.println("Eligible To Vote :");
}
else 
	System.out.println("NOT Eligible To Vote");
}
}

/*WAP to demonstrate nested if statement of 5 subjects.
 * the person who gets above 60% will be passed otherwise failed.
 * output should be like:Enter your name,Enter marks for the 5 subjects.
*/
package CoreJava;
import java.util.Scanner;
class Nested_If {
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
//Enter name 
System.out.println("Enter your Name : ");
String name = sc.nextLine();
//Marks of 5 subjects
System.out.println("Enter marks of Computer Science : ");
int sub1 = sc.nextInt();
System.out.println("Enter marks of English : ");
int sub2 = sc.nextInt();
System.out.println("Enter marks of Hindi : ");
int sub3 = sc.nextInt();
System.out.println("Enter marks of Maths : ");
int sub4 = sc.nextInt();
System.out.println("Enter marks of Social Science : ");
int sub5 = sc.nextInt();
int total_marks = sub1+sub2+sub3+sub4+sub5;
int percentage = total_marks/5*100;
if (percentage>=60)
{
	System.out.println("Student is pass :");
}
else 
	System.out.println("Student is fail :");
	
}
}

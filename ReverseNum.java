/*
 * WAP to print Reverse of numbers for example 
 * 10 9 8 7 6 5 4 3 2 1 using do-while loop and 
 * take the input from the user.
 */
package CoreJava;
import java.util.Scanner;
class ReverseNum 
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
long rev =0;
//Enter a number
System.out.println("Enter a number : ");
long num = sc.nextLong();
//using do while loop
do
{
//check remainder by dividing the number with 10
long rem = num%10;
//reversing a number by mul with 10,add remainder
rev = rev *10+rem;
num = num/10;
}while(num!=0);
System.out.println("The Reverse of a number is :"+rev);
sc.close();
}
}
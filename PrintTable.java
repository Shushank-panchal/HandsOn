package CoreJava;
import java.util.Scanner;
class PrintTable 
{
public static void main(String[] args)
{ int i;
Scanner sc = new Scanner(System.in);
//enter a number 
System.out.println("Enter a Number : ");
int num = sc.nextInt();
//for loop to print the table
for(i =1;i<=10;i++)
{
System.out.println(num+"*"+i+"="+num*i);
sc.close();
}
}
}

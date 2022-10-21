package CoreJava;
import java.util.Scanner;
class ArrayReverse
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);	
System.out.println("Enter the String : ");
String arr = sc.nextLine();
//Array Print 
System.out.println("Enter the String Elements : ");
char a[] = arr.toCharArray();
System.out.println("Reverse of a String : ");
int i = a.length;
for(int j=i;j>0;j--)
{
System.out.println(a[j-1]);
}
}
}

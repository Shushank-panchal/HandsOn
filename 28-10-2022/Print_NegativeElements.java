package CoreJava;
import java.util.Scanner;
class Print_NegativeElements
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
//Array Size
System.out.println("Enter the size of Array :");
int n = sc.nextInt();
//Array Elements 
int a[] = new int[n];
System.out.println("Enter the Elements of an Array  : ");
//iterate the nth elements to print the elements 
for(int i = 0 ;i < n; i++)
{
a[i]= sc.nextInt();
}
System.out.println("Negative Elements of an Array are : ");
for(int i = 0 ;i < n; i++)
{
if(a[i]<0)
{
	System.out.println(a[i]+" ");
}
}
sc.close();
}
}

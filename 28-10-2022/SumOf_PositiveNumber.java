package CoreJava;
import java.util.Scanner;
class SumOf_PositiveNumber 
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int sum = 0;
//Array Size
System.out.println("Enter the size of array : ");
int n = sc.nextInt();
//Array Elements 
int a[] = new int[n];
System.out.println("Enter the Array Elements : ");
//iterate the n element by using loop
for(int i = 0; i< n;i++)
{
a[i]= sc.nextInt();
}
for(int i = 0; i< n;i++)
{
if(a[i]>=0)
{
sum =sum+a[i];
}
else 
{
	System.out.println("You Entered negative numbers : ");
}
}
System.out.println("Sum of Positive numbers in an array : "+sum);
sc.close();
}
}
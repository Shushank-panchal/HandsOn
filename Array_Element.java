package CoreJava;
import java.util.Scanner;
public class Array_Element {
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter The size of Array :");
int num = sc.nextInt();
//Array Elements
System.out.println("Enter the Elements : ");
int a[] = new int[num];
//traversing The Array
for(int i=0;i<num;i++)
{
a[i]=sc.nextInt();
}
System.out.println("The Even Numbers :");
for(int i=0;i<num;i++)
{
if(a[i]%2==0)
{
		System.out.println(a[i]+" ");
}
System.out.println(" ");
}
}
}


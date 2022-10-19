/*
 * 2.Write a program that creates integer array of 10 elements, 
 * accepts values of arrays and Find sum of all odd numbers.
 */
package CoreJava;
import java.util.Scanner;
class ArrayInt {
public static void main(String[] args)
{
int Size, i, OddSum = 0;
Scanner sc = new Scanner(System.in);
System.out.print(" Please Enter Number of elements in an array : ");
Size = sc.nextInt();	
	
int [] a = new int[Size];
	
System.out.print(" Please Enter " + Size + " elements of an Array  : ");
for (i = 0; i < Size; i++)
{
a[i] = sc.nextInt();
}   

for(i = 0; i < Size; i++)
{
if(a[i] % 2 != 0)
{
OddSum = OddSum + a[i]; 
}
}		
System.out.println("\n The Sum of Odd Numbers in this Array = " + OddSum);
}
}

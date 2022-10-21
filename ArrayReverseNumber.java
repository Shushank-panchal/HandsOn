package CoreJava;
import java.util.Scanner;
class ArrayReverseNumber
{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
//Size of Array
System.out.println("Enter the Number ");
int num = sc.nextInt();
//Array Elements
System.out.println("Array Elements : ");
int arr[] = new int[num];
for(int i =0;i< arr.length;i++)
{   arr[i] = sc.nextInt();
	System.out.println(arr[i]+" ");
}
System.out.println("Reverse of a number : ");
for(int i=arr.length-1;i>=0;i--)
{
	System.out.println(arr[i]+" ");
}
}
}

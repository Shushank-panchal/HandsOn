package CoreJava;
import java.util.Arrays;
import java.util.Scanner;
class Array_Sort_MethodSecond
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
//Size of Array
System.out.println("Size of Array");
int num = sc.nextInt();
//array print
int arr[] = new int[num] ;
System.out.println("Array is ");
for(int i = 0;i<arr.length;i++)
{   arr[i] = sc.nextInt();
	System.out.println(arr[i]+"");
}
Arrays.sort(arr);
System.out.println("Sorted Array is : ");
for(int i=0;i<arr.length;i++)
{  
	System.out.println(arr[i]+"");
}
}
}

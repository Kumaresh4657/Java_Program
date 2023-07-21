package level_1;
import java.util.*;
public class largest {
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
int a=arr.length;
int arr1[]=new int[n];
int b=arr1.length;
System.out.println("Enter the first array:");
for(int i=0;i<arr.length;i++)
{
    arr[i]=sc.nextInt();
}
System.out.println(Arrays.toString(arr));
System.out.println("Enter the second array:");
for(int i=0;i<arr1.length;i++)
{
    arr1[i]=sc.nextInt();
}
System.out.println(Arrays.toString(arr1));
int c1=a+b;
int c[]=new int[c1];
for(int i=0;i<arr.length;i++)
{
  c[i]=arr[i];
}
for(int i=0;i<arr1.length;i++)
{
  c[a+i]=arr1[i];
}
System.out.println(Arrays.toString(c));
}
}


import java.util.*;

class pell
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.print("Enter the numbers ");
int n= sc.nextInt();
int a,b,c;
a=0;
b=1;
System.out.print(a +" "+b+" ");
for(int i=2;i<n;i++)
{
c=(b*2)+a;
System.out.print(c +" ");
a=b;
b=c;
}
}
}



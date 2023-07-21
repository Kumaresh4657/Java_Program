package test2;
import java.util.*;
public class Alex {
     public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
    int count=0;
    int counter=1;
    int n=sc.nextInt();
    int ar[]=new int[n];
    for(int i=0;i<n;i++)
    {
    ar[i]=sc.nextInt();
    }
    for(int i=0;i<ar.length;i++)
    {
    count=1;
    for(int j=i+1;j<ar.length;j++)
    {
    if(ar[i]==ar[j])
    {
    count++;
    }
    }
    if(count==2)
    {
    counter++;
    }
    }
    System.out.println(counter);
    }
    }

import java.util.*;
public class rightrot {
        public static void main(String []args)
    {
    Scanner s = new Scanner(System.in);
    int a[]=new int[5];
    int i,j,k,temp;
    for(i=0; i<5; i++)
    {
    a[i] = s.nextInt();
    }
    k=s.nextInt();
    for(i=0; i<k; i++)
    {
                temp=a[5-1];
                for(j=5-1; j>0; j--)
                {
                    a[j]=a[j-1];
                }
    
                a[j]=temp;
     }
    
    for(i=0; i<5; i++)
     {
    System.out.print(a[i]+" ");
    }
    }
    }

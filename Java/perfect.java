import java.util.*;
public class perfect {
    perfect()
    {
        
        Scanner obj=new Scanner(System.in);
        int n= obj.nextInt();
        int sum=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }

    public static void main(String []args)
    {
        perfect obj=new perfect();
    }
    
}

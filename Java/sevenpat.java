import java.util.*;
public class sevenpat {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
         
        int rows = sc.nextInt();
         
        for (int i = 1; i <= rows; i++) 
        {
            for (int j = 1; j <= rows-i; j++)
            {
                System.out.print(1);
            }
             
            for (int j = 1; j <= i; j++)
            {
                System.out.print(i);
            }
             
            System.out.println();
        }
         
        sc.close();
    }
}


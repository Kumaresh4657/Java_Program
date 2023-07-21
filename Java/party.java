import java.util.*;
public class party {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        int[] E = new int[t];
        int[] L = new int[t];
        for (int i= 0;i<t;i++);
        E[i] = sc.nextInt();
        
    }
    for (int i= 0;i < t;i++){
        L[i] = sc.nextInt();
    }
    sc.close();
    int max =0;
    int guests=0;
    for (int i=0;i<t;i++){
        guests = guests + E[i] - L[i];
        max =Math.max(max,guests);
    }
    System.out.println("The maximum is:" + max);
    
}

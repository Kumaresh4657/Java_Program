import java.util.*;
public class meta {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
    int t=4;
    while(t-->0){
        String s=sc.next();
        String s1=sc.next();
        int c=0;
        for(int i=0;i<s.length();i++){
        if(s.charAt(i)!=s1.charAt(i))
        c++;
    }
        if(c>2)
      System.out.println("No");
                else
                   System.out.println("Yes");
                  }
        }
    }

package Test;
import java.util.*;
public class words{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String words[]=a.split(" ");
        String b=words[words.length-1];
        System.out.println(b.length());
    }
}

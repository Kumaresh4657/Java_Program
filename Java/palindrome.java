import java.util.*;
class palindrome{
public static void main (String args[]){
Scanner sc=new Scanner(System.in);
String st=sc.nextLine();
char ch[]=st.toCharArray();
int n=st.length()-1;
String s="";
for(int i=st.length()-1;i>=0;i--){
s=s+ch[i];
n--;
}

if(st.equals(s)){
System.out.println("palindrome");
}
else{
System.out.print("not palindrome");
}
}
}
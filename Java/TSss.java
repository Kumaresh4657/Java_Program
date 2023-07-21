
import java.util.*;
public class TSss {

public static void main(String args[] ) throws Exception { Scanner s = new Scanner(System.in);

int no=s.nextInt();

while(no!=0)

{String str=s.next();

int count=0;

if(!str.contains("W")|| !str.contains("B"))

{  System.out.println("0"); count=0; }

else

{if(str.contains("WWBWW"))

{ int cc=(str.split("WWBWW",-1).length)-1;  count=count+(cc*4); str=str.replace("WWBWW","ZZ");}

if(str.contains("WBWW"))

{int cc=(str.split("WBWW",-1).length)-1;  count=count+(cc*3);  str=str.replace("WBWW","ZZ");}

if(str.contains("WWBW"))

{int cc=(str.split("WWBW",-1).length)-1;  count=count+(cc*3);  str=str.replace("WWBW","ZZ");}

if(str.contains("WBW"))

{int cc=(str.split("WBW",-1).length)-1;  count=count+(cc*2);  str=str.replace("WBW","ZZ"); }

if(str.contains("BWW"))

{ int cc=(str.split("BWW",-1).length)-1;  count=count+(cc*2);  str=str.replace("BWW","ZZ");}

if(str.contains("WWB"))

{ int cc=(str.split("WWB",-1).length)-1; count=count+(cc*2); str=str.replace("WWB","ZZ");}

if(str.contains("BW"))

{int cc=(str.split("BW",-1).length)-1; count=count+(cc*1);  str=str.replace("BW","ZZ"); }

if(str.contains("WB"))

{ int cc=(str.split("WB",-1).length)-1; count=count+(cc*1); str=str.replace("WB","ZZ"); }

System.out.println(count);

}no--;

}}}
package Test;
import java.util.*;
class circle{
void circle()
	{
		Scanner sc=new Scanner(System.in);
		float p=3.14f,r,area;
		r=sc.nextInt();
		area=p*r*r;
		System.out.println(area);
	}
}
class rectangle extends circle
{
	void printarea1()
	{
	Scanner sc=new Scanner(System.in);
	int l,b,area;
	l=sc.nextInt();
	b=sc.nextInt();
	area=l*b;
	System.out.println(area);
	}
}
class square extends rectangle
{
	void printarea2()
	{
	Scanner sc=new Scanner(System.in);
	int area,l;
	l=sc.nextInt();
	area=l*l;
	System.out.println(area);
	}
}


public class shape {
	public static void main(String[] args)
	{
		square obj=new square();
		obj.circle();
		obj.printarea1();
		obj.printarea2();
	}

	
}
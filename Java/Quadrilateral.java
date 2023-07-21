import java.util.Scanner;
class square
{
    public double sqArea(int a) 
    {
        return a * a;
    }
}
class rectangle extends square
{
    public double rectArea(int a, int b) 
    {
        return a * b;
    }
}

class parallelogram extends rectangle
{
    public int paraArea(int b,int h) 
    {
        return b * h;
    }
}
class trapezoid extends parallelogram
{
    public int trapeArea(int a, int b,int h) 
    {
        return ((a+b)/2)*h;
    }
}

class Quadrilateral extends trapezoid
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Quadrilateral r = new Quadrilateral();
        System.out.print("Enter bottom base of trapezoid : ");
        int a = sc.nextInt();
        System.out.print("Enter top base of trapezoid : ");
        int b = sc.nextInt();
        System.out.print("Enter height of trapezoid : ");
        int c = sc.nextInt();
        System.out.println("Area of trapezoid : " + r.trapeArea(a,b,c));
        System.out.print("Enter breadth of parallelogram : ");
        int d = sc.nextInt();
        System.out.print("Enter height of parallelogram : ");
        int e = sc.nextInt();
        System.out.println("Area of parallelogram : " + r.paraArea(d,e));
        System.out.print("Enter breadth of rectangle : ");
        int f = sc.nextInt();
        System.out.print("Enter height of rectangle : ");
        int g = sc.nextInt();
        System.out.println("Area of rectangle : " + r.rectArea(f,g));
        System.out.print("Enter side of square : ");
        int h = sc.nextInt();
        System.out.println("Area of square : " + r.sqArea(h));
    }
}
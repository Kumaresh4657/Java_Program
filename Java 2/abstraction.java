class k{
    void dance()
    {
        System.out.println("kumaresh");
    }
}
class r extends k
{
    void play()
    {
        System.out.println("Cse");
    }
}
public class abstraction {
    public static void main(String args[])
    {
        r obj=new r();
        obj.dance();
        obj.play();
    }
    
}

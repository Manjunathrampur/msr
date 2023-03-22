package obstractclass;
abstract class whatsapp
{
void status()
{
System.out.println("wow status");	
}
public abstract void reels();
public abstract void shoping();
}
abstract class whatsapp2 extends whatsapp
{
public void reels()
{
System.out.println("wow reels");	
}
}
class whatsapp3 extends whatsapp2
{
public void shoping()
{
System.out.println("wow shoping");	
}
}


public class Main_class
{
public static void main(String[]args)
{
whatsapp3 v=new whatsapp3();
v.status();
v.reels();
v.shoping();
}
}

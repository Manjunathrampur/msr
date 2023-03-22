package obstraction;
interface animal
{
public abstract void noise();	
}
class cat implements animal
{
public void noise()
{
System.out.println("mew");	
}
}
class dog implements animal
{
public void noise()
{
System.out.println("bow");	
}
}
class stimulater
{
 static void anisum(animal a)
{
a.noise();	
}
}

public class Mainclass
{
	public static void main(String[] args) {
		
	
cat c=new cat();
dog b=new dog();

stimulater.anisum(c);
stimulater.anisum(b);
}
}

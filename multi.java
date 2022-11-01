import java.util.Random;
class square extends thread
{
int x;
square(int n)
{
x=n;
}
public void run()
{
int sqr=x*x;
System.out.println("Square of "+x+" = "+sqr);
}
}
class cube extends thread
{
public void run()
{
Random random=new Random();
for(int i=0;i<10;i++)
{
int randomInteger=random.nextInt(100);
System.out.println("Random Integer Generated:"+randomInteger);
square s=new square(randomInteger);
s.Start();
cube c=new cube(randomInteger);
c.Start();
try
{
Thread.Sleep(1000);
}
catch(InterruptedException ex)
{
System.out.println(ex);
}
}
}
}
public class lab3
{
public static void main(String args[])
{
number n=new number();
n.Start();
}
}

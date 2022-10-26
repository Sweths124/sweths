import java.util.Random;
class Square extends thread
{
 int x;
Square(int n)
{
 x=n;
}
public void run()
{
 int sqr=x*x;
 System.out.println("Square of" +x+ "="+sqr);
 }
}
class Cube extends thread
{
 int x;
 Cube (int n)
{
 x=n;
}
public void run()
{
 int cub=x*x*x;
 System.out.println("cube of"+x+"="+cub);
 }
}
class Number extends thread
{
public void run()
{
Random random = new Random();
for(int i=0;i<10;i++)
{
  int randomInteger = random.nextInt(100);
  System.out.println("Random Integers generated:"+randomInteger);
  Square s = new Square(randomInteger);
  s.start();
  Cube c = new Cube(randomInteger);
  c.start();
try{
thread.sleep(1000);
}
catch(InterruptedException ex) {
System.out.println(ex);
}
}
}
}
public class thread{
public static void main(String args[])
{
  Number n = new Number();
  n.start();
}
}

 

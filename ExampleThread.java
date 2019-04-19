// class A
class A implements Runnable
{
	public void run()
	{
		int i;
		for(i=0; i<=10; i++)
			System.out.println("Thread A : " +i);
	}
}

//class B 
class B implements Runnable
{
	public void run()
	{
		int i;
		for(i=0; i<=10; i++)
			System.out.println("Thread B : " +i);
	}
}

//main class
public class ExampleThread
{
	public static void main(String[] args)
	{
		Thread t1=new Thread(new A());
		Thread t2=new Thread(new B());
		t1.start();
		t2.start();
	}
}

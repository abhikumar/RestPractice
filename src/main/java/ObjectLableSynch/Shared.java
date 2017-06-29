package ObjectLableSynch;

public class Shared {
	int data;
	synchronized public void show(int i)
	{
		System.out.println(Thread.currentThread().getName()+" start value "+data);
		this.data=i;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" end value "+data);
	}

}

package ObjectLableSynch;

public class Main {
public static void main(String[] args) {
	Shared shared1=new Shared();
	Shared shared2=new Shared();
	T1 t1=new T1(shared1);
	
	T2 t2=new T2(shared2);
	Thread tt1=new Thread(t1);
	tt1.setName("tt1");
	Thread tt2=new Thread(t2);
	tt2.setName("tt2");
	tt1.start();
	tt2.start();
}
}

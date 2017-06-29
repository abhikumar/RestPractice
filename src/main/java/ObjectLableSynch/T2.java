package ObjectLableSynch;

public class T2 implements Runnable {
	public T2(Shared sh) {
		super();
		this.sh = sh;
	}
	public Shared sh;
	@Override
	public void run() {
		sh.show(10);
	}

}

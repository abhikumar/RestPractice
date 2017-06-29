package ObjectLableSynch;

public class T1 implements Runnable {
public T1(Shared sh) {
		super();
		this.sh = sh;
	}
public Shared sh;
	@Override
	public void run() {
		sh.show(5);

	}

}

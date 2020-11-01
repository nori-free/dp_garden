// package garden;

public class Turnstile extends Thread {

	private Counter count;
	private int max;

	Turnstile(int max) {
		this.count = new Counter();
		this.max = max;
	}

	public void run() {
		int i = 0;
		while(i < this.max) { // 残りが0人以上のとき繰り返す
			System.out.printf("%d, %d%n", this.max, i);
			Thread.yield();
			i++;
		}
	}

}

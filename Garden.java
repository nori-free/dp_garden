// package garden;
import java.util.Random;

// import garden.Turnstile;

public class Garden {

	private Counter count = new Counter();

	private Turnstile[] turnstile;

	public static void main(String... args) {
		for(int j = 0; j < 2; j++) {
            new Turnstile(10).start();
        }
	}

	/**
	 * 乱数を返す。0なら西門、1なら東門、2なら両方から来園者が来ることを意味する
	 * @return int pattern
	*/
	public int getPattern() {
		Random random = new Random();
		return random.nextInt(2);
	}

}

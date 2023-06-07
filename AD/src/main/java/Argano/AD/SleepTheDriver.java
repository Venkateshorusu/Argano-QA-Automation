package Argano.AD;

public class SleepTheDriver {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void sleep(int i) {
		try {
			Thread.sleep(i*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
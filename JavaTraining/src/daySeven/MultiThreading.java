package daySeven;

class Mul1 extends Thread {
	public void run() {
		for (int i = 1; i <= 30; i++) {
			System.out.println("java");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Mul2 extends Thread {
	public void run() {
		for (int i = 1; i <= 30; i++) {
			System.out.println("Multithreading");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class MultiThreading {
	public static void main(String[] args) {
		Mul1 m1 = new Mul1();
		Mul2 m2 = new Mul2();
		m1.start();
		try {
			Thread.sleep(5);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
			
		}

		m2.start();
	}
}

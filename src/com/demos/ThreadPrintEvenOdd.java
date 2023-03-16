package com.demos;

public class ThreadPrintEvenOdd {

	static int counter = 1;
	static int N;

	private void printOdd() {
		synchronized (this) {
			while (counter < N) {
				// if count is even then print
				while (counter % 2 == 0) {
					try {
						wait();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				System.out.println(counter + " ");
				counter++;
				notify();
			}

		}
	}

	private void printEven() {
		synchronized (this) {
			while (counter < N) {
				// if count is odd then print
				while (counter % 2 == 1) {
					try {
						wait();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				System.out.println(counter + " ");
				counter++;
				notify();
			}

		}
	}

	public static void main(String[] args) {
		N = 20;
		final ThreadPrintEvenOdd tSample = new ThreadPrintEvenOdd();

		Thread tEvenNumber = new Thread(new Runnable() {

			@Override
			public void run() {
				tSample.printEven();

			}
		});

		Thread tOddNumber = new Thread(new Runnable() {

			@Override
			public void run() {
				tSample.printOdd();

			}
		});
		tEvenNumber.start();
		tOddNumber.start();
	}

}

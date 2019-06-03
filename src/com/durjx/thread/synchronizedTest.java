package com.durjx.thread;

public class synchronizedTest implements Runnable {

  public static void main(String[] args) {
    Thread t1 = new Thread(new synchronizedTest());
    Thread t2 = new Thread(new synchronizedTest());
    t1.start();
    t2.start();
  }

  @Override
  public synchronized void run() {
    // synchronized (this) {
    for (int i = 0; i < 100; i++) {
      System.out.println(i);
    }
    //  }
  }
}

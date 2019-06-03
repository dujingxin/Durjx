package com.durjx.thread;

/** 验证并发与串行之间的速率关系 */
public class ConcurrencyTest {

  private static final long count = 10000001;

  public static void main(String[] args) throws Exception {
    concurrency();
    serial();
  }

  public static void concurrency() throws Exception {

    long start = System.currentTimeMillis();
    Thread thread =
        new Thread(
            new Runnable() {
              @Override
              public void run() {
                int a = 0;
                for (long i = 0; i < count; i++) {
                  a += 5;
                }
              }
            });
    thread.start();
    int b = 0;
    for (long i = 0; i < count; i++) {
      b--;
    }
    thread.join();
    long time = System.currentTimeMillis() - start;
    System.out.println("concurrency:" + time + "ms,b=" + b);
  }

  public static void serial() {
    long start = System.currentTimeMillis();
    int a = 0;
    for (long i = 0; i < count; i++) {
      a += 5;
    }
    int b = 0;
    for (long i = 0; i < count; i++) {
      b--;
    }
    long time = System.currentTimeMillis() - start;
    System.out.println("concurrency:" + time + "ms,b=" + b);
  }
}

package com.durjx.thread;

import com.sun.corba.se.impl.orbutil.closure.Future;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class synchroThread implements Runnable {

  private String name;
  private Object pre;
  private Object last;

  public synchroThread(String name, Object pre, Object last) {
    this.name = name;
    this.pre = pre;
    this.last = last;
  }

  @Override
  public void run() {
    int i = 10;
    while (i > 0) {
      synchronized (pre) {
        System.out.println(Thread.currentThread().getName() + "  i:" + i + " ");
        i--;
        pre.notify();
      }
    }
  }

  public static void main(String[] args) {

    Object a = "a";
    Object b = "b";
    Object c = "c";
    new Thread(new synchroThread("A", a, b)).start();
    new Thread(new synchroThread("B", a, c)).start();
    new Thread(new synchroThread("C", a, c)).start();

    ExecutorService pool = Executors.newFixedThreadPool(10);
    ExecutorService pool1 = Executors.newCachedThreadPool();
    ExecutorService pool2 = Executors.newScheduledThreadPool(10);
    pool.shutdown();
    Future future;
  }
}

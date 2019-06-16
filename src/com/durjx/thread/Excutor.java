package com.durjx.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Excutor {
  public static void main(String args[]) {
    ExecutorService executor = Executors.newSingleThreadExecutor();
    ExecutorService executorService = Executors.newCachedThreadPool();
    ExecutorService executorService1 = Executors.newFixedThreadPool(10);
    for (int i = 0; i < 5; i++) {
      executorService.execute(
          new Runnable() {
            @Override
            public void run() {
              System.out.println("Thread excutors:" + Thread.currentThread().getName());
            }
          });
    }
    executorService.shutdown();
  }
}

package com.durjx.test;

import java.util.*;
import java.util.concurrent.SynchronousQueue;

public class TEST3 {
  public static void main(String[] args) {

    Map map = new HashMap<>();
    map.entrySet();
    Map.Entry.comparingByKey();
    String s = new String(new StringBuffer("abscd"));
    ArrayList arrayList;
    System.out.println(s.charAt(1));
    Stack stack = new Stack();
    stack.push(1);
    stack.push(2);
    stack.search(3);
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    Queue queue = new SynchronousQueue();
    try {
      ((SynchronousQueue) queue).put(1);
      ((SynchronousQueue) queue).put(2);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println(queue.poll());
  }
}

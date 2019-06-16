package com.durjx.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class test2 {
  public static void main(String[] args) {
    List list1 = new CopyOnWriteArrayList();
    // 同步实现ArrayList (1) CopyOnWriteArrayList (2)Collections.synchronizedList(list1);
    List list2 = Collections.synchronizedList(list1);
    ArrayList arrayList = new ArrayList();

    list1.add(1);
    list1.add(2);
    list1.add(1);
    list1.add(2);
    arrayList.addAll(list1);
    arrayList.set(3, "a");
    // arrayList.clear(); //清空ArrayList
    System.out.println(arrayList.get(3));
    arrayList.trimToSize();
    // System.out.println(arrayList.get(5));
    for (Object l : arrayList) {
      System.out.println(l.toString());
    }

    List linkedList = new LinkedList();
    linkedList.add(0, 10085);
    System.out.println(((LinkedList) linkedList).pop());
  }
}

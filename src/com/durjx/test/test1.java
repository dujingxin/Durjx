package com.durjx.test;

import java.util.HashMap;
import java.util.Iterator;

public class test1 {
  public static void main(String[] args) {
    /*  byte i = 1;
    int y = i;
    System.out.println(y);
    short j = 1;
    j = (short) (j + 1);
    j += 1;*/

    HashMap hm = new HashMap(1);
    HashMap mv = new HashMap(12, 0.65f);
    Character character;
    // HashMap m1 = new HashMap(Map<? extends K,? extends V> m);
    hm.put(1, "a");
    hm.put(2, "a");
    Iterator it = hm.keySet().iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
    }
    System.out.println(hm.get(1));
    System.out.println(hm.size());
  }
}

package com.durjx.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTest {
  public static void main(String[] args) {
    HashMap hashMap = new HashMap();
    System.out.println(hashMap.size());
    hashMap.put("hello", 1);
    hashMap.put(1, "hello");
    Iterator it = hashMap.entrySet().iterator();

    while (it.hasNext()) {
      Map.Entry map = (Map.Entry) it.next();
      System.out.println(map.getKey() + " :  " + map.getValue());
    }
  }
}

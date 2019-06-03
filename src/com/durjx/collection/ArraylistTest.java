package com.durjx.collection;

import java.util.*;

public class ArraylistTest {
  public static void main(String[] args) {

    List list = new ArrayList();
    // 默认初始值为0，添加一个元素之后变为10，每次自动扩容调用grow（）方法，oldCapacity + (oldCapacity >> 1);即每次增长1.5倍
    List list2 = new ArrayList(10);
    System.out.println("list2.size():  ");
    list.add("hello");
    list.add(1, "AddIndex");
    List<Integer> listArray =
        new ArrayList<Integer>() {
          {
            add(1);
            add(2);
            add(3);
          }
        };
    List<String> listArray2 = Arrays.asList("a", "b", "v");
    System.out.println("listArray2: " + listArray2.toString());
    System.out.println(listArray.toString());
    // list.toString()
    Iterator<Integer> itInteger = listArray.iterator();
    Iterator it = list.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());

      Collection c = new ArrayList();
      c.size();
    }
  }
}

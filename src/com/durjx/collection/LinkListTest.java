package com.durjx.collection;

import java.util.LinkedList;
import java.util.List;

public class LinkListTest {
  public static void main(String[] args) {
    List list = new LinkedList();
    list.add("1");
    ((LinkedList) list).addFirst("2"); // 将指定元素插入此列表的开头。
    ((LinkedList) list).addLast("3"); // 将指定元素添加到此列表的结尾。
    System.out.println(list.toString());
    System.out.println(list.indexOf("1")); //  返回此列表中首次出现的指定元素的索引，如果此列表中不包含该元素，则返回 -1。
    ((LinkedList) list).offer("3");

    System.out.println(((LinkedList) list).peek()); // 获取但不移除此列表的头（第一个元素）。
    System.out.println(((LinkedList) list).poll()); // 获取并移除此列表的头（第一个元素）
    System.out.println(list.toString());
    ((LinkedList) list).pop();
    ((LinkedList) list).push("5"); // 将元素推入此列表所表示的堆栈。
    System.out.println(list.toString());
  }
}

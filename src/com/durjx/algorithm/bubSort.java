package com.durjx.algorithm;

/** 冒泡排序，最大的数放在最右边 */
public class bubSort {

  private static int[] sort(int a[]) throws IllegalArgumentException {
    int tmp;
    if (a.length == 0) {
      throw new IllegalArgumentException("数组的大小为空");
    }
    for (int i = 0; i < a.length - 1; i++) { // 数组的大小控制比较的次数，循环一次结束最大的值不在比较
      for (int j = 0; j < a.length - 1 - i; j++) { // 数组中元素的比较次数，一遍循环完成之后将最大值放到最右侧
        if (a[j] > a[j + 1]) { // 第一次排序结果 2, 1, 5, 4, 7, 6, 9, 3
          tmp = a[j + 1];
          a[j + 1] = a[j];
          a[j] = tmp;
        }
        for (int b : a) {
          System.out.print(b + " ");
        }
        System.out.println();
      }
      System.out.println("-------------");
    }
    return a;
  }

  /**
   * 冒泡排序改进，冒泡排序的缺点在于，不管数组是不是有序，都会进行比较。 此处增加了一个变量，如果数组为无序的则进行排序，有序的则退出循环。
   *
   * @param a
   * @return
   * @throws Exception
   */
  public static int[] sortUpdate(int a[]) throws Exception {

    boolean isSort = true;
    int length = a.length;
    int tmp;
    if (a.length == 0) {
      throw new Exception("数据的大小为空");
    }
    for (int i = 0; i < length - 1; i++) {
      for (int j = 0; j < length - 1 - i; i++) {
        if (a[j] > a[j + 1]) { // 第一次排序结果 2, 1, 5, 4, 7, 6, 9, 3
          tmp = a[j + 1];
          a[j + 1] = a[j];
          a[j] = tmp;
          isSort = false;
        }
      }
      if (isSort) {
        break;
      }
    }
    return a;
  }

  public static void main(String[] args) {
    int[] a = {4, 2, 5, 1, 7, 6, 9, 3};
    for (int b : bubSort.sort(a)) {
      System.out.print(b + " ");
    }
  }
}

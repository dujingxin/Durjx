package com.durjx.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class student implements InvocationHandler {

  private String name;
  private String age;

  public student() {}

  public student(String name, String age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAge() {
    return age;
  }

  public void setAge(String age) {
    this.age = age;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

    Object result = method.invoke(proxy, args);
    return null;
  }
}

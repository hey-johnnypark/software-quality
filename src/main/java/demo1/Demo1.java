package demo1;

import demo2.Demo2;

public class Demo1 {

  private Demo2 demo2;

  public Demo1(Demo2 demo2) {
    super();
    this.demo2 = demo2;
  }

  public void demo() {
    demo2.demo();
  }

}

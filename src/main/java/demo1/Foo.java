package demo1;

import demo2.Bar;

public class Foo {

  private Bar bar;

  public Foo(Bar bar) {
    super();
    this.bar = bar;
  }

  public void demo(Bar bar) {
    bar.notify();
  }

}

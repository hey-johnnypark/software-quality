package findbugs;

public class Main {

  void infiniteRecursion() {
    infiniteRecursion();
  }

  Boolean isItTrue() {
    return null;
  }

  String castToString(Object obj) {
    return (String) obj;
  }

  boolean dereference(Object obj1, Object obj2) {
    return ((null == obj1 && null == obj2) || obj1.equals(obj2));
  }

  /**
   * main
   * @param args argument
   */
  public static void main(String[] args) {
    Main main = new Main();
    main.infiniteRecursion();
    main.dereference(null, 1);
    if (main.isItTrue()) {
      System.out.println("FooBar");
    }
    main.castToString("String");
  }

}

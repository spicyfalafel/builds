package mypackage;

import clojure.java.api.Clojure;
import clojure.lang.IFn;

public class MyClass {
  public static void main(String[] args) {
    IFn require = Clojure.var("clojure.core", "require");
    require.invoke(Clojure.read("hello"));
    IFn plus = Clojure.var("hello", "myplus");

    System.out.println(plus.invoke(1, 2));
    System.out.println("hi from java main");
  }
}

import java.util.*;

public class Dog extends Animal implements Comparable<Dog>{

  public Dog(String name, int legs) {
    super(name, legs);
  }

  public String toString() {
    return "name: " + name + " legs: " + legs;
  }
}

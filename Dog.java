import java.util.*;

public class Dog extends Animal implements Comparable<Dog>{

  public Dog(String name, int legs) {
    super(name, legs);
  }

  public String toString() {
    return "name: " + name + " legs: " + legs;
  }

  public static void main(String[] args) {
    ArrayList<Dog> pack = new ArrayList<Dog>();
    Dog d1 = new Dog("Sydney", 4);
    Dog d2 = new Dog("Chloe", 4);
    Dog d3 = new Dog("Sydney", 3);
    pack.add(d1);
    pack.add(d2);
    pack.add(d3);
    System.out.println(pack);
    System.out.println(Collections.sort(pack));
  }

  public int compareTo() { //natural ordering
    return 0;
  }
}

//iniates the dog class with types of properties
//int stands for a whole number integer
//string expects alphanumeric symbols wrapped in quotes
//calling void before a function definition tells the compiler that you
//do not expect the funciton to return a value

class Dog {
  String breed;
  int age;
  String color;

  void bark() {

  }

  void hungry() {

  }
}

//still not entirely sure, but I believe the public class mean it is viewable by the rest of the codebase?

public class Chihuahua {

  public static void main(String args[]) {
    Dog chihuahua = new Dog();
    chihuahua.breed = "Chihuhua";
    chihuahua.age = 10;
    chihuahua.color = "Brown";
    System.out.println("Chihuhua age: " + chihuahua.age);

  }
}

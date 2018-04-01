public class Human {
  public int humanAge;
  //arguments have to passed in some kind of order?
  public Human(String name, int age) {
    humanAge = age;
    System.out.println("Name chosen is: " + name);
  }

  public int getAge() {
    System.out.println("Human's age is :" + humanAge );
    return humanAge;
  }

  public static void main(String[] args) {
    Human myHuman = new Human("Christian", 22);


    myHuman.getAge();
  }
}

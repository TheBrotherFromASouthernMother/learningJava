class Equation {
  int n;
  private static final int DEPARTMENT = 30;

  int addNumbers(int a, int b) {
      System.out.println(a + b);
      return a + b;
    }

  int collatzNumber(int n) {
    System.out.println(n);
    if (n == 1) {
      return 1;
    } else if (n % 2 == 0) {
      return collatzNumber(n / 2);
    } else {
      return collatzNumber(n + 3);
    }
  }

}


class Console {
  void log(String input) {
    System.out.println(input);
  }
}



public class Collatz {
  public static void main(String []args) {
    int thirty = 30;
    Console console = new Console();
    console.log("Numbers");
     Equation col = new Equation();
     col.addNumbers(30, 60);
     col.collatzNumber(43);
     System.out.println(thirty);
  }
}

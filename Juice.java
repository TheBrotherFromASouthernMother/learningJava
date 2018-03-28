class FreshJuice {
  enum FreshJuiceSizes{ SMALL, MEDIUM, LARGE }
  FreshJuiceSizes size;
}

public class Juice{

    public static void main(String args[]) {
      FreshJuice juice = new FreshJuice();
      juice.size = FreshJuice.FreshJuiceSizes.MEDIUM;
      System.out.println("Size: " + juice.size);
    }
}

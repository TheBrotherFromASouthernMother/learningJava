import java.io.*;

public class Country {
  int population;
  String official_name;
  String language;

  public Country(int pop, String name, String lang) {
    this.population = pop;
    this.official_name = name;
    this.language = lang;

  }

  public void printCountry() {
    System.out.println(this.official_name);
  }

}

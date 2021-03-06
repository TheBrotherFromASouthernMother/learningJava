import java.io.*;

class Supranational {
  protected final boolean flag = true;
  String name;
  String region;
  Object[] members;
  Supranational(String organization_name, String region, Object[] members) {
    this.name = organization_name;
    this.region = region;
    this.members = members;
  };
}


public class UN {
  public static void main(String args[]) {
    Country peru = new Country(4000, "La Republica del Peru", "Espanol");
    Country Germany = new Country(4000, "The Federal Republic of Germany", "Deutch");
    Country Norway = new Country(4000, "Kingdom of Norway", "Norwegian");
    Country Turkey = new Country(4000, "Republic of Turkey", "Turkish");
    peru.printCountry();
    Supranational EU = new Supranational("European Union", "Europe", new String[]{Germany.official_name, Norway.official_name, Turkey.official_name});
    System.out.println(EU.name);
    System.out.println(EU.region);
    for (int i = 0; i < EU.members.length; i ++) {
        System.out.println(EU.members[i]);
    }
        System.out.println(EU.flag);

  }
}

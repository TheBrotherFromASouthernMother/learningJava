import java.io.*;

class Supranational {
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
    Supranational EU = new Supranational("European Union", "Europe", new Object[]{Germany, Norway, Turkey});
    System.out.println(EU.name);
    System.out.println(EU.region);
    for (int i = 0; i < EU.members.length; i ++) {
        Object member = EU.members[i];
        System.out.println(member);
    }
    CopyFile fs = new CopyFile();
    fs.getFile();
  }
}

class CopyFile {

  public static void getFile() throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
           in = new FileInputStream("javaIsWeird.txt");
           out = new FileOutputStream("output.txt");

           int c;
           while ((c = in.read()) != -1) {
              out.write(c);
           }
        }finally {
           if (in != null) {
              in.close();
           }
           if (out != null) {
              out.close();
           }
        }
     }
}

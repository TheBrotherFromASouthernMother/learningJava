package com.mycompany.app;
import static spark.Spark.*;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
      try {
           Spark.port(Integer.valueOf(System.getenv("PORT"))); // needed for Heroku
         } catch (Exception e) {
             System.err.println("NOTICE: using default port.  Define PORT env variable to override");
         }
        System.out.println( "Hello World!" );
        get("/hello", (req, res) -> "Hello World");
        get("/", (req, res) -> "NOOOOOO");
    }
}

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
        System.out.println( "Hello World!" );
        get("/hello", (req, res) -> "Hello World");
        get("/", (req, res) -> "NOOOOOO");
    }
}
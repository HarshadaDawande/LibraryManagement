package main.java.pluralsight;

import static java.lang.System.out;

public class HelloRunnable {

 	Runnable r1 = () -> out.println(this);
  	Runnable r2 = () -> out.println(toString());

        	public String toString() { return "Hello, world!"; }

        	public static void main(String... args) {
            		new HelloRunnable().r1.run(); //Hello, world!
             		new HelloRunnable().r2.run(); //Hello, world!
             	}
 }

package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        System.out.println("Anvita Rokade");
        Object myObject = null;
        /**
         * Checker prevents this from compiling...
         */
//        System.out.println("myObject: " + myObject.toString());
        /**
         * ... which is simply fantastic. It shows:
         *
         * error: [dereference.of.nullable] dereference of possibly-null
         * reference myObject
         *
         * http://checkerframework.org
         */
        System.out.println("Thank you");
    }
}

package com.javarush.test.level15.lesson12.home04;

/**
 * Created by Rum on 25.09.2015.
 */
public class Moon implements Planet
{
    static String MOON = "moon";

    private static Moon instance;

    private Moon(){}

    public static Moon getInstance()
    {
       if (instance==null)
       {
           instance= new Moon();
       }
        return instance;
    }
}

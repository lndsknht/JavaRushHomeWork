package com.javarush.test.level15.lesson12.home04;

/**
 * Created by Rum on 25.09.2015.
 */
public class Earth implements Planet
{
    private static String EARTH = "earth";

    private static Earth instance;

    private Earth(){}

    public static Earth getInstance()
    {
        if (instance==null)
        {
            instance = new Earth();
        }
        return instance;
    }
}

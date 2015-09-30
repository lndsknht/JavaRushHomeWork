package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Rum on 11.09.2015.
 */
public class BelarusianHen extends Hen
{
    public int getCountOfEggsPerMonth()
    {
        return 30;
    }

    public String getDescription()
    {

        return   super.getDescription() + " Моя страна - " + Country.BELARUS + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";

    }
}

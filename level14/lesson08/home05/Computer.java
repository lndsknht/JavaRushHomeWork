package com.javarush.test.level14.lesson08.home05;

/**
 * Created by Kopc on 14.09.2015.
 */
public class Computer
{
    private Keyboard keyboard;
    private Mouse mouse;
    private Monitor monitor;

   /* 9. ������ ����������� � ������ Computer ��������� ���������� ������ Alt+Insert ������ ������ (������� Constructor).
        10 ������ ������������ ��������������� ��� ��� ���� (����������) ������
    11. ������ ������� ��� ����� ������ Computer (� ������ ��������� ���������� ������ Alt+Insert � ������ ������� Getter).
        12. ��� ��������� ������ � ��������� ������ ���� � ��������� ������.
        13. ����� Solution ������ ������.
        */

    public Computer()
    {
        this.keyboard = new Keyboard();
        this.mouse = new Mouse();
        this.monitor = new Monitor();
    }

    public Keyboard getKeyboard()
    {
        return keyboard;
    }

    public Mouse getMouse()
    {
        return mouse;
    }

    public Monitor getMonitor()
    {
        return monitor;
    }
}

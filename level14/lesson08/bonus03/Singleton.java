package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by Kopc on 15.09.2015.
 */
/* Singleton
����� �������� ���������� (��������� �������(������) Singleton), ���� ��������� ������� ����� ���� ������ ������ ����.

����������� Singleton pattern:
1. ������ ����� Singleton � ��������� �����.
2. ������ � ���� ����������� ����� getInstance().
3. ����� getInstance ������ ���������� ���� � ��� �� ������ ������ Singleton ��� ����� ������ ������ getInstance.
4. �������, ����� ������� ����� ��������� �������� ������ �������� ����� ������.
5. ������ ��� ������������ � ������ Singleton ���������� (private).

6. � ����� ������ ���� ����������� ������� ������ (��������� ������) ������ ��������� ����� getInstance.
*/
public class Singleton
{
    private static int getCount = 0;
    private Singleton(){}
    private final static Singleton singleton = new Singleton();
    public static Singleton getInstance()
    {
        if (getCount==0)
            getCount++;
        return singleton;
    }
}
